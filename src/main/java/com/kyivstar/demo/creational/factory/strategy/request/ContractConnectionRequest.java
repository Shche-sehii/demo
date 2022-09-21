package com.kyivstar.demo.creational.factory.strategy.request;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.SuperBuilder;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Value
@SuperBuilder
public class ContractConnectionRequest extends ConnectionRequest{

    String serialNumber;

}
