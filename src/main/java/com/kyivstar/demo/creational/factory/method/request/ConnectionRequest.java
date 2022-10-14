package com.kyivstar.demo.creational.factory.method.request;

import com.kyivstar.demo.domain.IdentityCard;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
public interface ConnectionRequest {

    void fill(IdentityCard idCard);

    void send();

}
