package site.wentailai.example.pawnMove;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import site.wentailai.example.pawnMove.dp.abstractfactory.SenderFactory;
import site.wentailai.example.pawnMove.dp.factorymethod.Notification;

import javax.annotation.Resource;

@SpringBootTest
class AbstractFactoryTests {

	@Value("${notification.env}")
	private String env;

    @Resource
	SenderFactory mockSenderFactory;

    @Resource
	SenderFactory realSenderFactory;

	@Test
	void testFactoryMethod() {
		getSenderFactory().getEmailSender().send("from@xx.com", "to@xx.com", "hello from email");
		getSenderFactory().getMsgSender().send("13041000000", "hello from phone");
	}

	SenderFactory getSenderFactory() {
		if("test".equals(env)) {
			return mockSenderFactory;
		}
		else {
			return realSenderFactory;
		}
	}
}
