package site.wentailai.example.pawnMove.simplesample.interview;

import lombok.Data;
import lombok.ToString;

/**
 * User: libingkui
 * Date: 2020/9/11
 * Description:
 */
@Data
@ToString
public class Node implements Comparable<Node>{
    private Integer id;
    private String name;
    public Node left;
    public Node right;

    public Node(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Node(Integer id, Node right) {
        this.id = id;
        this.right = right;
    }

    public static Node getNodeTree() {
        Node head = new Node(1, "head");
        head.setLeft(new Node(2, "left1"));
        head.setRight(new Node(3, "right1"));
        head.getLeft().setLeft(new Node(4, "left11"));
        head.getLeft().setRight(new Node(5, "right11"));
        return head;
    }

    @Override
    public int compareTo(Node o) {
        return this.getId().compareTo(o.getId());
    }

}
