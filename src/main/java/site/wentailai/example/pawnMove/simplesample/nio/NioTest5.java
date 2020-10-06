package site.wentailai.example.pawnMove.simplesample.nio;

import java.nio.ByteBuffer;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest5 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(64);
        buffer.putInt(15);
        buffer.putLong(500000l);
        buffer.putChar('a');
        buffer.putShort((short)2);
        buffer.flip();
        System.out.println(buffer.getInt());
    }
}
