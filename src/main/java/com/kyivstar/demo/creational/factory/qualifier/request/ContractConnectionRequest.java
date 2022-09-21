package com.kyivstar.demo.creational.factory.qualifier.request;

import lombok.Builder;
import lombok.Value;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Value
@Builder
public class ContractConnectionRequest {

    String serialNumber;

    String firstName;

    String lastName;

}
