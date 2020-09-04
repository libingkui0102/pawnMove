package site.wentailai.example.pawnMove.dp.abstractfactory;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: libingkui
 * Date: 2020/8/30
 * Description:
 */
@Service("mockSenderFactory")
public class MockSenderFactory implements SenderFactory {
    @Resource
    private MsgSender mockMsgSender;
    @Resource
    private EmailSender mockEmailSender;

    @Override
    public MsgSender getMsgSender() {
        return mockMsgSender;
    }

    @Override
    public EmailSender getEmailSender() {
        return mockEmailSender;
    }
}
