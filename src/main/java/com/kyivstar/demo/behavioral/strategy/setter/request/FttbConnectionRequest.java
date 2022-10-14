package com.kyivstar.demo.behavioral.strategy.setter.request;

import lombok.Value;
import lombok.experimental.SuperBuilder;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Value
@SuperBuilder
public class FttbConnectionRequest extends ConnectionRequest {

    String address;

}
