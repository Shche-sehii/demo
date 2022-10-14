package com.kyivstar.demo.behavioral.strategy.setter;


import com.kyivstar.demo.behavioral.strategy.setter.request.ConnectionRequest;

public interface ConnectionDeliveryService {

    void send(ConnectionRequest request);
}
