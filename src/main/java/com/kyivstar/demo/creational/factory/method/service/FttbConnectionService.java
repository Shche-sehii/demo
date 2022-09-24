package com.kyivstar.demo.creational.factory.method.service;

import com.kyivstar.demo.creational.factory.method.request.FttbConnectionRequest;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @author v.kostiukevych
 * date 15/09/2022
 */
@Service
public class FttbConnectionService extends NewConnectionService {

    @Lookup
    @Override
    public FttbConnectionRequest createRequest() {
        return null;
    }

}
