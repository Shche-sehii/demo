package com.kyivstar.demo.creational.factory.qualifier.service;


import com.kyivstar.demo.creational.factory.qualifier.request.FttbConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface FttbConnectionDeliveryService {

    void send(FttbConnectionRequest request);

}
