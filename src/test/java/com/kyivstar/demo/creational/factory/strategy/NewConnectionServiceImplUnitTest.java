package com.kyivstar.demo.creational.factory.strategy;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.kyivstar.demo.creational.factory.domain.ConnectionType;
import com.kyivstar.demo.creational.factory.domain.IdentityCard;
import com.kyivstar.demo.creational.factory.domain.TestIdCard;
import com.kyivstar.demo.creational.factory.strategy.request.ConnectionRequest;
import com.kyivstar.demo.creational.factory.strategy.service.ConnectionDeliveryService;
import com.kyivstar.demo.creational.factory.strategy.service.ConnectionFactory;
import com.kyivstar.demo.creational.factory.strategy.service.ConnectionFactoryProvider;
import com.kyivstar.demo.creational.factory.strategy.service.NewConnectionServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NewConnectionServiceImplUnitTest {

    public static final ConnectionType CONNECTION_TYPE = ConnectionType.CONTRACT;
    @InjectMocks
    private NewConnectionServiceImpl newConnectionService;

    @Mock
    private ConnectionFactoryProvider connectionFactoryProvider;

    @Mock
    private ConnectionFactory connectionFactory;

    @Mock
    private ConnectionDeliveryService connectionDeliveryService;

    @Mock
    private ConnectionRequest connectionRequest;

    @Test
    void execute_whenCorrectConnectionTypeAndIdCard_thenSendRequest() {
        IdentityCard idCard = TestIdCard.getIdCard();

        when(connectionFactoryProvider.getFactory(CONNECTION_TYPE)).thenReturn(connectionFactory);
        when(connectionFactory.getService()).thenReturn(connectionDeliveryService);
        when(connectionFactory.createRequest(idCard)).thenReturn(connectionRequest);

        newConnectionService.execute(idCard, CONNECTION_TYPE);

        verify(connectionDeliveryService).send(connectionRequest);
    }
}
