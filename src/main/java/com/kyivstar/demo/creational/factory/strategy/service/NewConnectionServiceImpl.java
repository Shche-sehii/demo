package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.creational.factory.domain.ConnectionType;
import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;
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

    public void execute(IdentityCard idCard, ConnectionType connectionType) {
        ConnectionFactory factory = connectionFactoryProvider.getFactory(connectionType);
        ConnectionRequest request = factory.createRequest(idCard);
        ConnectionDeliveryService service = factory.getService();
        service.send(request);
    }

}
