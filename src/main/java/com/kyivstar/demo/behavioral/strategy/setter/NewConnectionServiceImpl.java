package com.kyivstar.demo.behavioral.strategy.setter;

import com.kyivstar.demo.behavioral.strategy.setter.request.ConnectionRequest;
import com.kyivstar.demo.domain.IdentityCard;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.ConversionService;
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

    public void execute(IdentityCard idCard, String connectionType) {
        ConnectionRequest request = conversionService.convert(idCard, ConnectionRequest.class);
        deliveryService.send(request);
    }

    public void setConnectionDeliveryService(ConnectionDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
}
