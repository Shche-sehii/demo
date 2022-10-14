package com.kyivstar.demo.behavioral.strategy.setter.converter;

import com.kyivstar.demo.behavioral.strategy.setter.request.ConnectionRequest;
import com.kyivstar.demo.behavioral.strategy.setter.request.ContractConnectionRequest;
import com.kyivstar.demo.behavioral.strategy.setter.request.FttbConnectionRequest;
import com.kyivstar.demo.domain.ConnectionType;
import com.kyivstar.demo.domain.IdentityCard;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    public ConnectionRequest createRequest(ConnectionType connectionType,
            IdentityCard identityCard) {
        if (ConnectionType.FTTB.equals(connectionType)) {
            return FttbConnectionRequest.builder()
                    .address(identityCard.getAddress())
                    .firstName(
                            identityCard.getFirstName())
                    .lastName(identityCard.getLastName())
                    .build();
        } else if (ConnectionType.CONTRACT.equals(connectionType)) {
            return ContractConnectionRequest.builder().
                    firstName(identityCard.getFirstName())
                    .lastName(identityCard.getLastName())
                    .serialNumber(identityCard.getSerialNumber())
                    .build();
        }
        return null;
    }
}
