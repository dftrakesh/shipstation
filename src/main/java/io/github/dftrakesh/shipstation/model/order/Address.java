package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    private String name;
    private String company;
    private String street1;
    private String street2;
    private String street3;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phone;
    private Boolean residential;
    private String addressVerified;
}