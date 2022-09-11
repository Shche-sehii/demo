package com.kyivstar.demo.creational.factory;

import com.kyivstar.demo.creational.factory.strategy.OrderService;

public interface OrderServiceFactory {

    OrderService getOrderService(String type);
}
