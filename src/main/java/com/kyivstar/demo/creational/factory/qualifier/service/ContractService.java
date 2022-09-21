package com.kyivstar.demo.creational.factory.qualifier.service;

import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.qualifier.request.ContractConnectionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractService implements NewSubscriptionService {

    private final ContractConnectionDeliveryService contractConnectionDeliveryService;

    @Override
    public void createSubscription(IdentityCard identityCard) {
        contractConnectionDeliveryService.send(ContractConnectionRequest.builder()
                .lastName(identityCard.getLastName())
                .firstName(identityCard.getFirstName())
                .serialNumber(identityCard.getSerialNumber())
                .build());
    }
}
