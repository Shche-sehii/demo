package com.kyivstar.demo.behavioral.strategy.registry.service;


import com.kyivstar.demo.behavioral.strategy.registry.request.ContractConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface ContractConnectionDeliveryService extends ConnectionDeliveryService {

    void send(ContractConnectionRequest request);

}
