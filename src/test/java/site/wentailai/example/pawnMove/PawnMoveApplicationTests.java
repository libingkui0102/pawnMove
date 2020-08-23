package site.wentailai.example.pawnMove;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import site.wentailai.example.pawnMove.dp.factorymethod.Notification;

import javax.annotation.Resource;

@SpringBootTest
class PawnMoveApplicationTests {

	@Resource
	Notification notification;

	@Test
	void testFactoryMethod() {
		notification.sendSms();
	}
}
