package com.kyivstar.demo.creational.factory.method.service;

import com.kyivstar.demo.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.method.request.ConnectionRequest;
import lombok.RequiredArgsConstructor;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@RequiredArgsConstructor
public abstract class NewConnectionService {

    public void execute(IdentityCard idCard) {
        final var request = createRequest();
        request.fill(idCard);
        request.send();
    }

    protected abstract ConnectionRequest createRequest();

}
