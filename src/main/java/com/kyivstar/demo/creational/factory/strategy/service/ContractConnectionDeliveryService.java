package com.kyivstar.demo.creational.factory.strategy.service;


import com.kyivstar.demo.creational.factory.strategy.request.ContractConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface ContractConnectionDeliveryService extends ConnectionDeliveryService {

    void send(ContractConnectionRequest request);

}
