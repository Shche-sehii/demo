package com.kyivstar.demo.creational.factory.simple;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import com.kyivstar.demo.creational.factory.domain.ConnectionType;
import com.kyivstar.demo.creational.factory.domain.TestIdCard;
import com.kyivstar.demo.creational.factory.simple.request.ContractConnectionRequest;
import com.kyivstar.demo.creational.factory.simple.request.FttbConnectionRequest;
import com.kyivstar.demo.creational.factory.simple.service.ContractConnectionDeliveryService;
import com.kyivstar.demo.creational.factory.simple.service.FttbConnectionDeliveryService;
import com.kyivstar.demo.creational.factory.simple.service.NewConnectionServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NewConnectionServiceImplUnitTest {

    @InjectMocks
    private NewConnectionServiceImpl newConnectionService;

    @Mock
    private ContractConnectionDeliveryService contractConnectionDeliveryService;

    @Mock
    private FttbConnectionDeliveryService fttbConnectionDeliveryService;

    @Test
    void whenContract_thenUseContractDeliveryService() {
        newConnectionService.execute(TestIdCard.getIdCard(), ConnectionType.CONTRACT);

        verify(contractConnectionDeliveryService).send(ContractConnectionRequest.builder().build());
        verify(fttbConnectionDeliveryService, never()).send(any());
    }

    @Test
    void whenFttb_thenUseFttbDeliveryService() {
        newConnectionService.execute(TestIdCard.getIdCard(), ConnectionType.FTTB);

        verify(contractConnectionDeliveryService, never()).send(any());
        verify(fttbConnectionDeliveryService).send(FttbConnectionRequest.builder().build());
    }

}
