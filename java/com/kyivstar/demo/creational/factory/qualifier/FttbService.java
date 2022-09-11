package com.kyivstar.demo.creational.factory.qualifier;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import com.kyivstar.demo.creational.factory.qualifier.domain.Order;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FttbService implements NewSubscriptionService {

    @Qualifier("fttbOrderService")
    private final OrderService orderService;

    @Override
    public void createSubscription(Order order) {
        orderService.order(order);
    }
}
