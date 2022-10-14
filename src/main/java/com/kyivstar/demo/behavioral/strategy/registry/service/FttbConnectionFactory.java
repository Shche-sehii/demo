package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;
import com.kyivstar.demo.behavioral.strategy.registry.request.FttbConnectionRequest;
import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FttbConnectionFactory implements ConnectionFactory {

    private final FttbConnectionDeliveryService fttbConnectionDeliveryService;

    @Override
    public ConnectionRequest createRequest(IdentityCard idCard) {
        return FttbConnectionRequest.builder()
                .address(idCard.getAddress())
                .firstName(idCard.getFirstName())
                .lastName(idCard.getLastName())
                .build();
    }

    @Override
    public ConnectionDeliveryService getService() {
        return fttbConnectionDeliveryService;
    }
}
