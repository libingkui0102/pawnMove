package site.wentailai.example.pawnMove.dp.factorymethod;

import org.springframework.stereotype.Service;

@Service
public class RealSmsService implements SmsService{
    // 此处省略n行代码

    @Override
    public void send() {
        System.out.println("--------real sms service");
        // 此处省略n行代码
    }

    // 此处省略n行代码
}
