package com.kyivstar.demo.behavioral.strategy.registry.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConnectionFactoryProvider {

    private final FttbConnectionFactory fttbConnectionFactory;
    private final ContractConnectionFactory contractConnectionFactory;

    public ConnectionFactory getFactory(String connectionType) {
        if ("contract".equals(connectionType)) {
            return contractConnectionFactory;

        } else if ("fttb".equals(connectionType)) {
            return fttbConnectionFactory;
        }
        return null;
    }
}
