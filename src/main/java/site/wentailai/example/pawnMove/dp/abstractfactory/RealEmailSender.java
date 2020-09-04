package site.wentailai.example.pawnMove.dp.abstractfactory;

import org.springframework.stereotype.Service;

/**
 * User: libingkui
 * Date: 2020/8/30
 * Description:
 */
@Service("realEmailSender")
public class RealEmailSender implements EmailSender{
    @Override
    public void send(String from, String to, String content) {
        System.out.println("Real EmailSender from:" + from
                + " to:" + to
                + " content:" + content
        );
    }
}
