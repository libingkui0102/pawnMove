package site.wentailai.example.pawnMove.simplesample.interview;

import lombok.Data;

/**
 * User: libingkui
 * Date: 2020/9/14
 * Description:
 */
@Data
public class TreeNode implements Comparable<TreeNode> {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public int compareTo(TreeNode o) {
        return 0;
    }
}
