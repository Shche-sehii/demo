package com.kyivstar.demo.behavioral.strategy.registry.request;

import lombok.Value;
import lombok.experimental.SuperBuilder;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Value
@SuperBuilder
public class ContractConnectionRequest extends ConnectionRequest {

    String serialNumber;

}
