package com.kyivstar.demo.creational.factory.strategy;

import com.kyivstar.demo.creational.factory.OrderServiceFactory;
import com.kyivstar.demo.creational.factory.strategy.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewSubscriptionServiceImpl implements NewSubscriptionService {

    private final OrderServiceFactory orderServiceFactory;

    @Override
    public void createSubscription(Order order) {
        OrderService orderService = orderServiceFactory.getOrderService(order.getType());
        orderService.order(order);
    }
}
