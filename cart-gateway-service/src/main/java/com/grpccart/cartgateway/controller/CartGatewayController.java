package com.grpccart.cartgateway.controller;

import com.grpccart.cartgateway.dto.Cart;
import com.grpccart.cartgateway.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartGatewayController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    public void setCart(@RequestBody Cart cart){
        this.cartService.setCart(cart);
    }
}
