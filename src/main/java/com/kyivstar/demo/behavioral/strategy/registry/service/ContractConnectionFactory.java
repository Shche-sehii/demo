package com.kyivstar.demo.behavioral.strategy.registry.service;

import com.kyivstar.demo.behavioral.strategy.registry.request.ConnectionRequest;
import com.kyivstar.demo.behavioral.strategy.registry.request.ContractConnectionRequest;
import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContractConnectionFactory implements ConnectionFactory {

    private final ContractConnectionDeliveryService contractConnectionDeliveryService;

    @Override
    public ConnectionRequest createRequest(IdentityCard idCard) {
        verify(idCard);
        return ContractConnectionRequest.builder()
                .serialNumber(idCard.getSerialNumber())
                .firstName(idCard.getFirstName())
                .lastName(idCard.getLastName())
                .build();
    }

    @Override
    public ConnectionDeliveryService getService() {
        return contractConnectionDeliveryService;
    }

    private void verify(IdentityCard idCard) {
        if (isContractConnectionsLimitReached(idCard.getSerialNumber())) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isContractConnectionsLimitReached(String serialNumber) {
        return "AA1234".equals(serialNumber);
    }
}