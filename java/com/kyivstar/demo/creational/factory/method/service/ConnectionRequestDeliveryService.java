package com.kyivstar.demo.creational.factory.method.service;

import com.kyivstar.demo.creational.factory.method.request.ConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface ConnectionRequestDeliveryService {

    void send(ConnectionRequest request);

}
