package site.wentailai.example.pawnMove.simplesample.interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * User: libingkui
 * Date: 2020/9/11
 * Description: 主度遍历二叉树
 */
public class BFS {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.bfsTrans(Node.getNodeTree());
    }

    void bfsTrans(Node head) {
        Deque<Node> queue = new LinkedList();
         queue.offer(head);
         while (!queue.isEmpty()) {
             Node n = queue.poll();
             System.out.println(n.getName());
             if(n.getLeft() != null) {
                 queue.offer(n.getLeft());
             }
             if(n.getRight() != null) {
                 queue.offer(n.getRight());
             }
         }
    }
}
