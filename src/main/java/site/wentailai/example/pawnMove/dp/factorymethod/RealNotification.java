package site.wentailai.example.pawnMove.dp.factorymethod;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@ConditionalOnProperty(name = "notification.env", havingValue = "real")
public class RealNotification extends Notification{
    @Resource
    SmsService realSmsService;

    @Override
    SmsService createSmsService() {
        return realSmsService;
    }
}
