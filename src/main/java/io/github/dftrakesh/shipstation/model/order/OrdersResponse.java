package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrdersResponse {

    private List<Order> orders;
    private Integer total;
    private Integer page;
    private Integer pages;
    private String message;
    private String exceptionMessage;
    private String exceptionType;
    private String stackTrace;
}