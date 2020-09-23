package site.wentailai.example.pawnMove.simplesample.interview.leetcode;

import site.wentailai.example.pawnMove.simplesample.interview.TreeNode;

/**
 * User: libingkui
 * Date: 2020/9/23
 * Description:
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class SameTree {
    public boolean sameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else {
            if(p == null && q != null) {
                return false;
            }
            if(p != null && q == null) {
                return false;
            }
        }
        if(p.val == q.val) {
            return sameTree(p.left, q.left)
                    && sameTree(p.right, q.right);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        SameTree s = new SameTree();
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null),
                new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null),
                new TreeNode(3, null, null));
        System.out.println(s.sameTree(p, q));
//        TreeNode p = new TreeNode(1, new TreeNode(2, null, null),
//                null);
//        TreeNode q = new TreeNode(1, null,
//                new TreeNode(2, null, null));
//        System.out.println(s.sameTree(p, q));

    }
}
