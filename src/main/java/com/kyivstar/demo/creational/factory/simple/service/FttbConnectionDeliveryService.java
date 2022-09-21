package com.kyivstar.demo.creational.factory.simple.service;


import com.kyivstar.demo.creational.factory.simple.request.FttbConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface FttbConnectionDeliveryService {

    void send(FttbConnectionRequest request);

}
