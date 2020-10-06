package site.wentailai.example.pawnMove.simplesample.nio;

import java.nio.IntBuffer;
import java.security.SecureRandom;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(10);
        for(int i = 0; i < 5; i++) {
            int randomNumber = new SecureRandom().nextInt(20);
            intBuffer.put(randomNumber);
        }
        System.out.println("limit:" + intBuffer.limit());
        intBuffer.flip();
        System.out.println("limit:" + intBuffer.limit());
        while (intBuffer.hasRemaining()) {
            System.out.println("position:" + intBuffer.position());
            System.out.println("limit:" + intBuffer.limit());
            System.out.println("capacity:" + intBuffer.capacity());
            System.out.println(intBuffer.get());
        }
    }

}
