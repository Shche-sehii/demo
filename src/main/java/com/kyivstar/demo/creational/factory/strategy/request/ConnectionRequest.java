package com.kyivstar.demo.creational.factory.strategy.request;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class ConnectionRequest {

   String firstName;

   String lastName;

}
