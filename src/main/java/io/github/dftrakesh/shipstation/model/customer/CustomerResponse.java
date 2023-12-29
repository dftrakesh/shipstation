package io.github.dftrakesh.shipstation.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse {

    public int customerId;
    public String createDate;
    public String modifyDate;
    public String name;
    public String street1;
    public String street2;
    public String city;
    public String state;
    public String postalCode;
    public String countryCode;
    public String phone;
    public String email;
    public String addressVerified;
}