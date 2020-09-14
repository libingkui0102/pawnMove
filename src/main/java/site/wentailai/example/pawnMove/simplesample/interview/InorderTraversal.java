package site.wentailai.example.pawnMove.simplesample.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

/**
 * 非递归实现中序遍历二叉树
 * User: libingkui
 * Date: 2020/9/14
 * Description:
 */
public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        head.setRight(left);
        left.setLeft(right);
        InorderTraversal inorderTraversal = new InorderTraversal();
        List<Integer> list = inorderTraversal.inorderTraversal3(head);
        for(Integer i : list) {
            System.out.println(i);
        }
    }

    public List<Integer> inorderTraversal(TreeNode head) {
        List<Integer> rtn = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeSet<Integer> visited = new TreeSet<>();
        stack.push(head);
        while(!stack.isEmpty()) {
            TreeNode c = stack.peek();
            if(c.getLeft() != null && !visited.contains(c.getVal())) {
                stack.push(c.getLeft());
                visited.add(c.getVal());
            }
            else {
                rtn.add(c.getVal());
                stack.pop();
                if(c.getRight() != null) {
                    stack.push(c.getRight());
                    visited.add(c.getVal());
                }
            }
        }
        return rtn;
    }

    public List<Integer> inorderTraversal2(TreeNode head) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode c = head;
        while(c != null || !stack.isEmpty()) {
            if(c == null) {
                c = stack.pop();
                list.add(c.getVal());
                c = c.getRight();
            }
            else {
                stack.push(c);
                c = c.getLeft();
            }
        }
        return list;
    }
    public List<Integer> inorderTraversal3(TreeNode head) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode c = head;
        while(c != null || !stack.isEmpty()) {
            if(c == null) {
                c = stack.pop();
                list.add(c.getVal());
                c = stack.pop();
            }
            else {
                stack.push(c.getRight());
                stack.push(c);
                c = c.getLeft();
            }
        }
        return list;
    }
}
