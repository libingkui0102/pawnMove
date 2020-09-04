package site.wentailai.example.pawnMove.dp.abstractfactory;

/**
 * User: libingkui
 * Date: 2020/8/30
 * Description:
 */
public interface SenderFactory {
    MsgSender getMsgSender();
    EmailSender getEmailSender();
}
