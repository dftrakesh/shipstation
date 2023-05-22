package io.github.dftrakesh.shipstation.model.shipment;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "ShipNotice")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipNotice {

    private String OrderNumber;
    private Integer OrderID;
    private String CustomerCode;
    private String CustomerNotes;
    private String InternalNotes;
    private String NotesToCustomer;
    private String NotifyCustomer;
    private String LabelCreateDate;
    private String ShipDate;
    private String Carrier;
    private String Service;
    private String TrackingNumber;
    private String ShippingCost;
}
