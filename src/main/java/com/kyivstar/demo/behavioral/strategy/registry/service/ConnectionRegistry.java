package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.domain.ConnectionType;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConnectionRegistry {

    private final Map<ConnectionType, ConnectionFactory> connectionFactoryMap = new HashMap<>();

    public void register(ConnectionFactory connectionFactory, ConnectionType type) {
        connectionFactoryMap.put(type, connectionFactory);
    }

    public ConnectionFactory getFactory(ConnectionType connectionType) {
        return connectionFactoryMap.get(connectionType);
    }
}
