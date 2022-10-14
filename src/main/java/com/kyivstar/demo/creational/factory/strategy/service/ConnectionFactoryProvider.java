package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.creational.factory.domain.ConnectionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConnectionFactoryProvider {

    private final FttbConnectionFactory fttbConnectionFactory;
    private final ContractConnectionFactory contractConnectionFactory;

    public ConnectionFactory getFactory(ConnectionType connectionType) {
        if (ConnectionType.CONTRACT.equals(connectionType)) {
            return contractConnectionFactory;

        } else if (ConnectionType.FTTB.equals(connectionType)) {
            return fttbConnectionFactory;
        }
        return null;
    }
}
