
package io.github.dftrakesh.shipstation.model.shipment;

import lombok.Data;


@Data
public class ShipTo {

    private String name;
    private String company;
    private String street1;
    private String street2;
    private Object street3;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phone;
    private String residential;
}
