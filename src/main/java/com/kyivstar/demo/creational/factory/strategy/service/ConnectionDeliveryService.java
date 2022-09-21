package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;

public interface ConnectionDeliveryService {

    void send(ConnectionRequest request);
}
