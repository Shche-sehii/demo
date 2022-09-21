package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;

public interface ConnectionFactory {

    ConnectionRequest createRequest(IdentityCard idCard);

    ConnectionDeliveryService getService();
}
