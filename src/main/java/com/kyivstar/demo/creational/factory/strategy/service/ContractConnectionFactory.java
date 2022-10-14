package com.kyivstar.demo.creational.factory.strategy.service;

import com.kyivstar.demo.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;
import com.kyivstar.demo.creational.factory.strategy.request.ContractConnectionRequest;
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
