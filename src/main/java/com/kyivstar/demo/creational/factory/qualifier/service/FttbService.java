package com.kyivstar.demo.creational.factory.qualifier.service;

import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.qualifier.request.FttbConnectionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FttbService implements NewSubscriptionService {

    private final FttbConnectionDeliveryService fttbConnectionDeliveryService;

    @Override
    public void createSubscription(IdentityCard identityCard) {
        fttbConnectionDeliveryService.send(FttbConnectionRequest.builder()
                .lastName(identityCard.getLastName())
                .firstName(identityCard.getFirstName())
                .address(identityCard.getAddress()).build());
    }
}
