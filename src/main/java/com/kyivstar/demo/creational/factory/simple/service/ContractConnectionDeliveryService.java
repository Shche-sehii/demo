package com.kyivstar.demo.creational.factory.simple.service;


import com.kyivstar.demo.creational.factory.simple.request.ContractConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface ContractConnectionDeliveryService {

    void send(ContractConnectionRequest request);

}
