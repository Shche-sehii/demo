package com.kyivstar.demo.creational.factory.case_example.adapter;

import com.kyivstar.demo.creational.factory.case_example.OrderService;
import com.kyivstar.demo.creational.factory.case_example.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class FttbOrderService implements OrderService {

    @Override
    public void order(Order order) {
        // do some logic
    }
}
