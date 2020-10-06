package site.wentailai.example.pawnMove.simplesample.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * User: libingkui
 * Date: 2020/10/1
 * Description:
 */
public class NioTest11 {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel server = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(8899);
        server.socket().bind(address);

        int messageLength = 2 + 3 + 4;
        ByteBuffer[] buffers = new ByteBuffer[3];
        buffers[0] = ByteBuffer.allocate(2);
        buffers[1] = ByteBuffer.allocate(3);
        buffers[2] = ByteBuffer.allocate(4);

        SocketChannel socketChannel = server.accept();
        while(true) {
            int byteRead = 0;
            while (byteRead < messageLength) {
                long r = socketChannel.read(buffers);
                byteRead += r;
                System.out.println("bytesRead:" + byteRead);

                Arrays.asList(buffers).stream()
                        .map(buffer -> "position:" + buffer.position() + " limit:" + buffer.limit())
                        .forEach(System.out::println);
            }

            Arrays.asList(buffers).stream().forEach(ByteBuffer::flip);

            long bytesWritten = 0;
            while(bytesWritten < messageLength) {
                long r = socketChannel.write(buffers);
                bytesWritten += r;
            }
            Arrays.asList(buffers).stream().forEach(ByteBuffer::clear);

            System.out.println("bytes read:" + byteRead + ", bytes written:" + bytesWritten);
        }

    }
}
