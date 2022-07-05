package com.grpccart.cart.entity;

import lombok.Data;
import lombok.ToString;


@ToString
@Data
public class Cart {

    private Integer id;
    private Integer productId;
    private Integer quantity;



}
