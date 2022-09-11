package com.kyivstar.demo.creational.factory.case_example;

import com.kyivstar.demo.creational.factory.case_example.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewSubscriptionServiceImpl implements NewSubscriptionService {

    @Qualifier("fttbOrderService")
    private final OrderService fttbOrderService;

    @Qualifier("contractOrderService")
    private final OrderService contractOrderService;


    @Override
    public void createSubscription(Order order) {
        OrderService orderService = getOrderService(order);
        orderService.order(order);
    }

    private OrderService getOrderService(Order order) {
        return switch (order.getType()) {
            case "FTTB" -> fttbOrderService;
            case "CONTRACT" -> contractOrderService;
            default -> null;
        };
    }
}
