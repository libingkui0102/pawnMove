package site.wentailai.example.pawnMove.dp.factorymethod;

import org.springframework.stereotype.Service;

@Service
public class MockSmsService implements SmsService{
    @Override
    public void send() {
        System.out.println("---------mock sms service");
    }
}
