package site.wentailai.example.pawnMove.dp.abstractfactory;

/**
 * User: libingkui
 * Date: 2020/8/30
 * Description:
 */
public interface EmailSender {
    void send(String from, String to, String content);
}
