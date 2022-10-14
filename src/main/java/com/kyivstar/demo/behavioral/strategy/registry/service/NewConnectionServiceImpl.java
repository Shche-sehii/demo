package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;
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

    private final ConnectionFactoryProvider connectionFactoryProvider;

    public void execute(IdentityCard idCard, String connectionType) {
        ConnectionFactory factory = connectionFactoryProvider.getFactory(connectionType);
        ConnectionRequest request = factory.createRequest(idCard);
        ConnectionDeliveryService service = factory.getService();
        service.send(request);
    }

}
