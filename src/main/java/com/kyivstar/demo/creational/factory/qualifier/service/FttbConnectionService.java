package com.kyivstar.demo.creational.factory.qualifier.service;

import com.kyivstar.demo.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.qualifier.request.FttbConnectionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FttbConnectionService implements NewConnectionService {

    private final FttbConnectionDeliveryService fttbConnectionDeliveryService;

    @Override
    public void createSubscription(IdentityCard identityCard) {
        FttbConnectionRequest request = FttbConnectionRequest.builder()
                .lastName(identityCard.getLastName())
                .firstName(identityCard.getFirstName())
                .address(identityCard.getAddress()).build();

        fttbConnectionDeliveryService.send(request);
    }
}
