package site.wentailai.example.pawnMove.simplesample.nio;

import java.nio.ByteBuffer;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest7 {
    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocate(32);
        while (b.hasRemaining()) {
            b.put((byte)b.position());
        }

        ByteBuffer readOnly = b.asReadOnlyBuffer();
        System.out.println(readOnly.getClass());
        readOnly.flip();
        while (readOnly.hasRemaining()) {
            System.out.println(readOnly.get());
        }
    }
}
