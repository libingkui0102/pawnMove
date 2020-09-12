package site.wentailai.example.pawnMove.simplesample.interview;

import lombok.Data;

/**
 * User: libingkui
 * Date: 2020/9/11
 * Description:
 */
@Data
public class Node {
    private Integer id;
    private String name;
    Node left;
    Node right;

    public Node(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
