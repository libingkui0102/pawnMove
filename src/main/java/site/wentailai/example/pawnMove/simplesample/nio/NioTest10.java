package site.wentailai.example.pawnMove.simplesample.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest10 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f = new RandomAccessFile("bak.txt", "rw");
        FileChannel fc = f.getChannel();
        FileLock lock = fc.lock(1, 2, true);
        System.out.println("valid:" + lock.isValid());
        System.out.println("lock type(is shared):" + lock.isShared());

        lock.release();;
        f.close();

    }
}
