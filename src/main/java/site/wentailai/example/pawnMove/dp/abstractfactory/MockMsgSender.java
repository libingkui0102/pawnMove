package site.wentailai.example.pawnMove.dp.abstractfactory;

import org.springframework.stereotype.Service;

/**
 * User: libingkui
 * Date: 2020/8/30
 * Description:
 */
@Service
public class MockMsgSender implements MsgSender{
    @Override
    public void send(String phone, String content) {
        System.out.println("Mock MsgSender phone:" + phone + " content:" + content);
    }
}
