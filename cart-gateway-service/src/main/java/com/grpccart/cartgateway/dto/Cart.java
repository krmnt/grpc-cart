package com.grpccart.cartgateway.dto;

import lombok.Data;

@Data
public class Cart {
    private Integer id;
    private Integer productId;
    private Integer quantity;
}


