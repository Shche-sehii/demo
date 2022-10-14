package com.kyivstar.demo.creational.factory.simple.service;

import com.kyivstar.demo.domain.ConnectionType;
import com.kyivstar.demo.domain.IdentityCard;

import com.kyivstar.demo.creational.factory.simple.request.ContractConnectionRequest;
import com.kyivstar.demo.creational.factory.simple.request.FttbConnectionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author v.kostiukevych
 * date 16/09/2022
 */
@Service
@RequiredArgsConstructor
public class NewConnectionServiceImpl {

    private final ContractConnectionDeliveryService contractConnectionDeliveryService;

    private final FttbConnectionDeliveryService fttbConnectionDeliveryService;

    public void execute(IdentityCard idCard, ConnectionType connectionType) {
            if (ConnectionType.CONTRACT.equals(connectionType)) {
                verify(idCard);
                final var request = ContractConnectionRequest.builder()
                        .build();
                contractConnectionDeliveryService.send(request);

            } else if (ConnectionType.FTTB.equals(connectionType)) {
                final var request = FttbConnectionRequest.builder()
                        .build();
                fttbConnectionDeliveryService.send(request);
            }
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
