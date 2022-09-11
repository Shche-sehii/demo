package com.kyivstar.demo.creational.factory.qualifier;

import com.kyivstar.demo.creational.factory.qualifier.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractService implements NewSubscriptionService {

    @Qualifier("contractOrderService")
    private final OrderService orderService;

    @Override
    public void createSubscription(Order order) {
        orderService.order(order);
    }
}
