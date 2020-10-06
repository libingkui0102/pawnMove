package site.wentailai.example.pawnMove.simplesample.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("bak.txt");
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        byte[] message = "123451234512345".getBytes();

        for(int i = 0; i < message.length; i++) {
            if(i == 5) {
                byteBuffer.flip();
                fileChannel.write(byteBuffer);
                byteBuffer.mark();
                byteBuffer.reset();
                byteBuffer.flip();
            }
            byteBuffer.put(message[i]);
        }
        if(byteBuffer.hasRemaining()) {
            fileChannel.write(byteBuffer);
        }

        fileOutputStream.close();
    }
}
