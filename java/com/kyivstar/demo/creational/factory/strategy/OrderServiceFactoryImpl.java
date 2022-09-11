package com.kyivstar.demo.creational.factory.strategy;

import com.kyivstar.demo.creational.factory.OrderServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderServiceFactoryImpl implements OrderServiceFactory {

    @Qualifier("fttbOrderService")
    private final OrderService fttbOrderService;

    @Qualifier("contractOrderService")
    private final OrderService contractOrderService;

    public OrderService getOrderService(String type) {
        return switch (type) {
            case "FTTB" -> fttbOrderService;
            case "CONTRACT" -> contractOrderService;
            default -> null;
        };
    }
}
