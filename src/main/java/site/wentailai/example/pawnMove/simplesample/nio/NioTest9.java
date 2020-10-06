package site.wentailai.example.pawnMove.simplesample.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest9 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f = new RandomAccessFile("bak.txt", "rw");
        FileChannel fc = f.getChannel();

        MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_WRITE, 0, 5);
        buffer.put(0, (byte)'b');
        f.close();
    }
}
