package com.kyivstar.demo.creational.factory.qualifier.service;


import com.kyivstar.demo.creational.factory.qualifier.request.ContractConnectionRequest;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface ContractConnectionDeliveryService {

    void send(ContractConnectionRequest request);

}
