package com.lzhenxing.myproject.algorithm.tree;

import java.util.Stack;

/**
 *   ClassName: HeightOfTree <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/7
 */
public class HeightOfTree {

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int m = height(root.getLeft());
        int n = height(root.getRight());
        return m > n ? m+1 : n+1;
    }


    /**
     * 非递归后序遍历
     * @param root
     */
    public static int postOrderTraversalNonRecursion(TreeNode root){
        if(root == null){
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode lastNode = null;
        int maxLevel = 0;
        while(node != null || !stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node = node.getLeft();
            }else {
                TreeNode node1 = stack.peek();
                maxLevel = stack.size() > maxLevel ? stack.size() : maxLevel;
                if(node1.getRight() != null && node1.getRight() != lastNode){
                    node = node1.getRight();
                }else{
                    //System.out.print(node1.getValue());
                    lastNode = stack.pop();
                }
            }
        }
        return maxLevel;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.initTree();
        //System.out.println(height(root));
        System.out.println(postOrderTraversalNonRecursion(root));
    }
}


