package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;

public interface ConnectionDeliveryService {

    void send(ConnectionRequest request);
}
