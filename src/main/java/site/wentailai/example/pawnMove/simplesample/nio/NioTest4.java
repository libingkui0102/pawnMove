package site.wentailai.example.pawnMove.simplesample.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("pom.xml");
        FileOutputStream fo = new FileOutputStream("bak.txt");

        FileChannel fic = fi.getChannel();
        FileChannel foc = fo.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(true) {
            buffer.clear();

            int read = fic.read(buffer);
            System.out.println("read:" + read);
            if(-1 == read) {
                break;
            }
            buffer.flip();
            foc.write(buffer);
//            buffer.flip();
        }
        fi.close();
        fo.close();
    }
}
