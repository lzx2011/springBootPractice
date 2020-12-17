package com.lzhenxing.myproject.algorithm.tree;

/**
 *   ClassName: CommonParent <br/>
 *   Function: 公共祖先<br/>
 *
 *
 *
 * @author zhenxing.liu
 * @date 2020/12/16
 */
public class CommonParent {

    /**
     * init tree  1 2 3 4 null 5 6
     *         1
     *     2      3
     *  4  null 5   6
     * @return
     */
    public static TreeNode commonParent(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || p == root || q == root){
            return root;
        }
        TreeNode left = commonParent(root.left, p, q);
        TreeNode right = commonParent(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }


    public static void main(String[] args) {
        TreeNode root = TreeNode.initTree();
        //TreeNode root = null;
        TreeNode p = root.right;
        TreeNode q = root.left.left;
        TreeNode commonParent = commonParent(root, p, q);
        if(commonParent == null){
            System.out.println(commonParent);
        }else{
            System.out.println(commonParent.value);
        }
    }
}
