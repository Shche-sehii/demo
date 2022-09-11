package com.kyivstar.demo.creational.factory.qualifier.adapter;

import com.kyivstar.demo.creational.factory.qualifier.OrderService;
import com.kyivstar.demo.creational.factory.qualifier.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class FttbOrderService implements OrderService {

    @Override
    public void order(Order order) {
        // do some logic
    }
}
