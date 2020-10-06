package site.wentailai.example.pawnMove.simplesample.nio;

import java.nio.ByteBuffer;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest6 {
    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocate(10);

        for(int i = 0; i < b.capacity(); i++) {
            b.put((byte)i);
        }

        b.position(2);
        b.limit(6);

        ByteBuffer slice = b.slice();
        for(int j = 0; j < slice.capacity(); j++) {
            slice.put((byte)22);
        }
        b.clear();
        while(b.hasRemaining()) {
            System.out.println(b.get());
        }

        System.out.println("----------------");
        slice.flip();
        while (slice.hasRemaining()) {
            System.out.println(slice.get());
        }
    }
}
