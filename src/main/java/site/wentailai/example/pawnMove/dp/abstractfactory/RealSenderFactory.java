package site.wentailai.example.pawnMove.dp.abstractfactory;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: libingkui
 * Date: 2020/8/30
 * Description:
 */
@Service("realSenderFactory")
public class RealSenderFactory implements SenderFactory {
    @Resource
    private MsgSender realMsgSender;
    @Resource
    private EmailSender realEmailSender;

    @Override
    public MsgSender getMsgSender() {
        return realMsgSender;
    }

    @Override
    public EmailSender getEmailSender() {
        return realEmailSender;
    }
}
