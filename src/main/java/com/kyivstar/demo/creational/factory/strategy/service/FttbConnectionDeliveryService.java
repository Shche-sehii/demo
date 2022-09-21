package com.kyivstar.demo.creational.factory.strategy.service;


import com.kyivstar.demo.creational.factory.strategy.request.FttbConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface FttbConnectionDeliveryService extends ConnectionDeliveryService{

    void send(FttbConnectionRequest request);

}
