package com.kyivstar.demo.behavioral.strategy.setter;

import com.kyivstar.demo.behavioral.strategy.setter.converter.ConversionService;
import com.kyivstar.demo.behavioral.strategy.setter.request.ConnectionRequest;
import com.kyivstar.demo.domain.ConnectionType;
import com.kyivstar.demo.domain.IdentityCard;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author v.kostiukevych date 16/09/2022
 */
@Service
@RequiredArgsConstructor
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class NewConnectionServiceImpl {

    private final ConversionService conversionService;
    private ConnectionDeliveryService deliveryService;

    public void execute(IdentityCard idCard, ConnectionType connectionType) {
        ConnectionRequest request = conversionService.createRequest(connectionType, idCard);
        deliveryService.send(request);
    }

    public void setConnectionDeliveryService(ConnectionDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
}
