package com.kyivstar.demo.creational.factory.method.request;

import com.kyivstar.demo.creational.factory.method.IdentityCard;
import com.kyivstar.demo.creational.factory.method.service.ConnectionRequestDeliveryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Component
@Scope(SCOPE_PROTOTYPE)
public class ContractConnectionRequest implements ConnectionRequest {

    private final ConnectionRequestDeliveryService deliveryService;

    String serialNumber;

    String firstName;

    String lastName;

    public ContractConnectionRequest(@Qualifier("bss") ConnectionRequestDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public void fill(IdentityCard idCard) {
        verify(idCard);
        this.serialNumber = idCard.getSerialNumber();
        this.firstName = idCard.getFirstName();
        this.lastName = idCard.getLastName();
    }

    @Override
    public void send() {
        deliveryService.send(this);
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
