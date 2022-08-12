package io.github.dftrakesh.shipstation;

import lombok.extern.log4j.Log4j2;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

@Log4j2
public class ShipStationStore {
	
	private String shop_url = "https://ssapi.shipstation.com";
	private String authStringEnc = "";

	public ShipStationStore(){}
	
	public ShipStationStore(String username, String password) {
		String authString = username + ":" + password;
		byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
		this.authStringEnc = new String(authEncBytes);
	}
	
	public String getJSONResponse(String resource, String method) {
		return getJSONResponse(resource, method, null) ;
	}
	
	public synchronized String getJSONResponse(String resource, String method, String payload) { 
		int iRetry = 1;
		ShipStationErrorMessage shipStationErrorMessage = null;
		boolean bError = false;
		while (iRetry <= 10) {
			try {
				bError = false;
				shipStationErrorMessage = getAPIJSONResponse(resource, method, payload);

				if (shipStationErrorMessage.getStatus().equals("SUCCESS")) {
					break;
				} else {
					bError = true;
					log.debug(" Try : " + iRetry + " [" + shipStationErrorMessage.getStatus() + "] Msg :"
							+ shipStationErrorMessage.getMessage());
				}
			} catch (Exception e) {
				bError = true;
				log.debug(" Error : " + e.getMessage());
			} finally {
				if(iRetry == 10){
					log.debug("shipstation max Try limit over " + iRetry + " [" + shipStationErrorMessage.getStatus() + "] Msg :"
							+ shipStationErrorMessage.getMessage()+" payload :"+payload);
				}
				iRetry++;
				if (bError) {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		return shipStationErrorMessage.getMessage();
	}
	public synchronized ShipStationErrorMessage getAPIJSONResponse(String resource, String method, String payload) {
		//logger.debug("Inside getJSONResponse. resource : " + resource + "\tmethod : " + method +"\tpayload : " + payload);
		BufferedReader bufferedReader = null;
		StringBuilder jsonStringBuilder;
		String status = null,message = null; 
		try {
			String strFinalURL = shop_url + resource;
	//		logger.debug("Final URL : " + strFinalURL);
			URL uRLObject = new URL(strFinalURL);
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLObject.openConnection();
			httpsURLConnection.setConnectTimeout(5000);
			httpsURLConnection.setRequestProperty("Accept", "application/json");
			httpsURLConnection.setRequestProperty("Content-Type", "application/json");
			httpsURLConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
			httpsURLConnection.setRequestMethod(method);
			if("POST".equalsIgnoreCase(method) || "PUT".equalsIgnoreCase(method)) {
				httpsURLConnection.setDoOutput(Boolean.TRUE);
				PrintWriter writter = new PrintWriter(httpsURLConnection.getOutputStream());
				writter.println(payload);
				writter.flush();
				writter.close();
			}
		//	logger.debug("Response Code : " + httpsURLConnection.getResponseCode());
			if(httpsURLConnection.getResponseCode() == 404) {		
				String errorMessage = "Shipstation API Down or URL not found";
				String subject = "Shipstation API Down or URL not found.";
				String content = "Hi, <br/> Issue while use Shipstation API.<br/><br/> " 
						+ "<b>Message Time:</b> " + new Date() 
						+ "<b>Error:</b> " + errorMessage
						+"<b>URL:</b>+"+strFinalURL;
				//utilService.sendEmail(subject, content);
				log.debug("Shipstation API Down or URL not found "+strFinalURL);
			}
			if(httpsURLConnection.getResponseCode() == 401) {
				status = "FAIL";
				message = "Received unauthorised error in shipstation api call";
				//SMSAndEmailUtils.sendSMS("Received unauthorised error in shipstation api call");
			}
			if(httpsURLConnection.getResponseCode() != 200 &&
					httpsURLConnection.getResponseCode() != 201 ) {
				bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getErrorStream()));
		        String line = "";
		        jsonStringBuilder = new StringBuilder();
		        while ((line = bufferedReader.readLine()) != null) {
		        	jsonStringBuilder.append(line);
		         }
		        if(status == null) {
					status = "FAIL";
					message = httpsURLConnection.getResponseCode() + "\t" + jsonStringBuilder;
				}  
				//throw new BCAPIException(httpsURLConnection.getResponseCode() + "\t" + jsonStringBuilder);
			} 
			bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
	        String line = "";
	        jsonStringBuilder = new StringBuilder();
	        while ((line = bufferedReader.readLine()) != null) {
	        	jsonStringBuilder.append(line);
	         }
	        if(status == null) {
				status = "SUCCESS";
				message = jsonStringBuilder.toString();
			} 
		} catch (Exception e) {
			log.debug("resource : " + resource + "\t Method : " + method + "\t Payload : " + payload);
			//throw new BCAPIException(e.getMessage(),e);
			if(status == null) {
				status = "FAIL";
				message = e.getMessage() + " " + e;
			} 
		} finally {
			try {
				if(bufferedReader != null)bufferedReader.close();
			} catch (IOException e) {
			}
		}
		return new ShipStationErrorMessage(message, status);
		//return jsonStringBuilder.toString();
	}
	
	public String mapToParameterString(HashMap<String, String> mapParams) {
		StringBuilder parameterString = new StringBuilder();
		if(mapParams != null && !mapParams.isEmpty()) {
			Iterator<String> iterator = mapParams.keySet().iterator();
			int iNumberOfParam = mapParams.size();
			while(iterator.hasNext()) {
				String strKey = iterator.next();
				try {
					parameterString.append(strKey + "=" +URLEncoder.encode( mapParams.get(strKey),"UTF-8") );
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					parameterString.append(strKey + "=" + mapParams.get(strKey) );
				}
				if((--iNumberOfParam) != 0) {
					parameterString.append("&");
				} 
			}
		}
		return new String(parameterString);
	}
	
	public class ShipStationErrorMessage {
		String message,status;
		
		public ShipStationErrorMessage(String message, String status) {	
			this.message = message;
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
				 
	}
}
