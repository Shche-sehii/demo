package com.kyivstar.demo.domain;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TestIdCard {

    public IdentityCard getIdCard() {
        return IdentityCard.builder()
                .lastName("LastName")
                .firstName("FirstName")
                .address("address")
                .serialNumber("serialNumber")
                .build();
    }

}
