package site.wentailai.example.pawnMove.dp.factorymethod;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@ConditionalOnProperty(name = "notification.env", havingValue = "test")
public class MockNotification extends Notification{
    @Resource
    SmsService mockSmsService;

    @Override
    SmsService createSmsService() {
        return mockSmsService;
    }
}
