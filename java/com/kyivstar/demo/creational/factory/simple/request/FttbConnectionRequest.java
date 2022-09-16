package com.kyivstar.demo.creational.factory.simple.request;

import lombok.Builder;
import lombok.Value;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Value
@Builder
public class FttbConnectionRequest {

    String firstName;

    String lastName;

    String address;

}
