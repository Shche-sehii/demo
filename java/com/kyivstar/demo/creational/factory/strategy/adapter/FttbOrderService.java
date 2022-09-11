package com.kyivstar.demo.creational.factory.strategy.adapter;

import com.kyivstar.demo.creational.factory.strategy.OrderService;
import com.kyivstar.demo.creational.factory.strategy.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class FttbOrderService implements OrderService {

    @Override
    public void order(Order order) {
        // do some logic
    }
}
