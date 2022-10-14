package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;
import com.kyivstar.demo.creational.factory.strategy.request.FttbConnectionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FttbConnectionFactory implements ConnectionFactory{

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
