package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;
import com.kyivstar.demo.domain.ConnectionType;
import com.kyivstar.demo.domain.IdentityCard;
import org.springframework.beans.factory.annotation.Autowired;

public interface ConnectionFactory {

    ConnectionRequest createRequest(IdentityCard idCard);

    ConnectionDeliveryService getService();

    @Autowired
    default void registerMe(ConnectionRegistry connectionRegistry) {
        connectionRegistry.register(this, getConnectionType());
    }

    ConnectionType getConnectionType();
}
