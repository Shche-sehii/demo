package com.kyivstar.demo.creational.factory.qualifier.service;

import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.qualifier.request.ContractConnectionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractConnectionService implements NewConnectionService {

    private final ContractConnectionDeliveryService contractConnectionDeliveryService;

    @Override
    public void createSubscription(IdentityCard identityCard) {
        ContractConnectionRequest request = ContractConnectionRequest.builder()
                .lastName(identityCard.getLastName())
                .firstName(identityCard.getFirstName())
                .serialNumber(identityCard.getSerialNumber())
                .build();

        contractConnectionDeliveryService.send(request);
    }
}
