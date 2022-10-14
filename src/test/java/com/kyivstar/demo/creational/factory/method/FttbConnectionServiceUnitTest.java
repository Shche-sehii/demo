package com.kyivstar.demo.creational.factory.method;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import com.kyivstar.demo.domain.IdentityCard;
import com.kyivstar.demo.domain.TestIdCard;
import com.kyivstar.demo.creational.factory.method.request.FttbConnectionRequest;
import com.kyivstar.demo.creational.factory.method.service.FttbConnectionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FttbConnectionServiceUnitTest {

    @Spy
    @InjectMocks
    private FttbConnectionService fttbConnectionService;

    @Mock
    private FttbConnectionRequest fttbConnectionRequest;

    @Test
    void execute_whenIdCardPassed_thenSend() {
        IdentityCard idCard = TestIdCard.getIdCard();

        doReturn(fttbConnectionRequest).when(fttbConnectionService).createRequest();

        fttbConnectionService.execute(idCard);

        verify(fttbConnectionRequest).fill(idCard);
        verify(fttbConnectionRequest).send();
    }
}
