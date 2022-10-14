package com.kyivstar.demo.behavioral.strategy.registry.service;


import com.kyivstar.demo.behavioral.strategy.registry.request.FttbConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface FttbConnectionDeliveryService extends ConnectionDeliveryService {

    void send(FttbConnectionRequest request);

}
