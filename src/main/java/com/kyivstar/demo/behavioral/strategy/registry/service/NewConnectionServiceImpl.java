package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;
import com.kyivstar.demo.behavioral.strategy.setter.domain.ConnectionType;
import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author v.kostiukevych
 * date 16/09/2022
 */
@Service
@RequiredArgsConstructor
public class NewConnectionServiceImpl {

    private final ConnectionRegistry connectionFactoryProvider;

    public void execute(IdentityCard idCard, ConnectionType connectionType) {
        ConnectionFactory factory = connectionFactoryProvider.getFactory(connectionType);
        ConnectionRequest request = factory.createRequest(idCard);
        ConnectionDeliveryService service = factory.getService();
        service.send(request);
    }

}
