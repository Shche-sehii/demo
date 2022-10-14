package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;
import com.kyivstar.demo.creational.factory.domain.IdentityCard;

public interface ConnectionFactory {

    ConnectionRequest createRequest(IdentityCard idCard);

    ConnectionDeliveryService getService();
}
