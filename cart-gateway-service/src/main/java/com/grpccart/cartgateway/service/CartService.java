package com.grpccart.cartgateway.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import com.kierangelo.grpccart.cart.CartServiceGrpc;

@Service
public class CartService {

    @GrpcClient("cart-service")
    private CartServiceGrpc.CartServiceBlockinStub cartStub; //GELO



}
