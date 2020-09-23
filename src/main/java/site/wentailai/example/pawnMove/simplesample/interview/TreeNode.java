package site.wentailai.example.pawnMove.simplesample.interview;

import lombok.Data;

/**
 * User: libingkui
 * Date: 2020/9/14
 * Description:
 */
@Data
public class TreeNode implements Comparable<TreeNode> {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(TreeNode o) {
        return 0;
    }
}
