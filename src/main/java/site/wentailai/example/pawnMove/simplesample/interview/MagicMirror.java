package site.wentailai.example.pawnMove.simplesample.interview;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * User: libingkui
 * Date: 2020/9/23
 * Description:两个线程轮流打印magic和mirror
 */
public class MagicMirror {
    int n;
    Object lock = new Object();
    AtomicBoolean magic = new AtomicBoolean(true);
    public MagicMirror(int n) {
        this.n = n;
    }
    public void magic() throws InterruptedException {
        while(n > 0) {
                synchronized (lock) {
                if(magic.get()) {
                    System.out.println("magic");
                    magic.set(false);
                    lock.notifyAll();
                }
                else {
                    System.out.println("------magic-------waiting()");
                    lock.wait();
                }
            }
        }
    }
    public void mirror() throws InterruptedException {
        while(n > 0) {
            synchronized (lock) {
                if(!magic.get()) {
                    System.out.println("mirror");
                    magic.set(true);
                    n--;
                    lock.notifyAll();
                }
                else {
                    System.out.println("------mirror-------waiting()");
                    lock.wait();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MagicMirror magicMirror = new MagicMirror(2);
        Thread magic = new Thread(() -> {
            try {
                magicMirror.magic();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread mirror = new Thread(() -> {
            try {
                magicMirror.mirror();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        magic.start();
        mirror.start();
        magic.join();
        mirror.join();
    }
}
