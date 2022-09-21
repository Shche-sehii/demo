package com.kyivstar.demo.creational.factory.method.request;

import com.kyivstar.demo.creational.factory.domain.IdentityCard;
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
public class FttbConnectionRequest implements ConnectionRequest {

    private final ConnectionRequestDeliveryService deliveryService;

    String firstName;

    String lastName;

    String address;

    public FttbConnectionRequest(@Qualifier("hybris") ConnectionRequestDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public void fill(IdentityCard idCard) {
        this.firstName = idCard.getFirstName();
        this.lastName = idCard.getLastName();
        this.address = idCard.getAddress();
    }

    @Override
    public void send() {
        deliveryService.send(this);
    }

}
