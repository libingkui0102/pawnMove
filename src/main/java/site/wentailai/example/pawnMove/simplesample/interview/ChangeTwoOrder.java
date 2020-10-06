package site.wentailai.example.pawnMove.simplesample.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * User: libingkui
 * Date: 2020/9/25
 * Description: 两两交换一个链表中的结点
 */
public class ChangeTwoOrder {
    @Data
    @AllArgsConstructor
    @ToString
    static class Node {
        private Integer id;
        private Node next;
    }
    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, new Node(3, (Node)null)));
        ChangeTwoOrder c = new ChangeTwoOrder();
        node = c.changeOrder(node);
        while(node != null) {
            System.out.println(node.getId());
            node = node.next;
        }
    }
    public Node changeOrder(Node node) {
        Node rtn = null;
        Node pre = null;
        Node a = null;
        Node c = node;
        int i = 0;
        while(c != null) {
            if(i == 0) {
                a = c;
                i ++;
            }
            else if(i == 1) {
                if(pre != null) {
                    pre.next = c;
                }
                else {
                    rtn = c;
                }
                a.next = c.next;
                c.next = a;
                c = a;
                pre = a;
                i = 0;
            }
            c = c.next;
        }
        return rtn;
    }
}
