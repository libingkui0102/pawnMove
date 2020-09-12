package site.wentailai.example.pawnMove.simplesample.interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * User: libingkui
 * Date: 2020/9/11
 * Description: 主度遍历二叉树
 */
public class BFS {
    synchronized
    public static Node getNodeTree() {
        Node head = new Node(1, "head");
        head.setLeft(new Node(2, "left1"));
        head.setRight(new Node(3, "right1"));
        head.getLeft().setLeft(new Node(4, "left11"));
        head.getLeft().setRight(new Node(5, "right11"));
        return head;
    }
    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.bfsTrans(getNodeTree());
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
