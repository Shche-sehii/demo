package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;
import com.kyivstar.demo.creational.factory.strategy.request.ContractConnectionRequest;
import com.kyivstar.demo.creational.factory.strategy.request.FttbConnectionRequest;
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
