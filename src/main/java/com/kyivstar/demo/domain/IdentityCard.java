package com.kyivstar.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Value
@Builder
public class IdentityCard {

    String serialNumber;

    String firstName;

    String lastName;

    String address;

}
