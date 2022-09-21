package com.kyivstar.demo.creational.factory.method.rest;

import com.kyivstar.demo.creational.factory.method.service.ContractConnectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author v.kostiukevych
 * date 16/09/2022
 */
@Component
@RequiredArgsConstructor
public class ContractConnectionResource {

    private final ContractConnectionService contractConnectionService;



}
