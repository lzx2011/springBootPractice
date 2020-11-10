package com.lzhenxing.myproject.algorithm.tree;

/**
 *   ClassName: TreeNode <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/7
 */
public class TreeNode {

        TreeNode left;
        TreeNode right;
        int value;

        public TreeNode(int value){
            this.value = value;
        }

        /**
         * init tree  1 2 3 4 null 5 6
         *         1
         *     2      3
         *  4  null 5   6
         * @return
         */
        public static TreeNode initTree(){
            TreeNode root = new TreeNode(1);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(3);
            TreeNode node4 = new TreeNode(4);
            TreeNode node5 = new TreeNode(5);
            TreeNode node6 = new TreeNode(6);

            root.left = node2;
            root.right = node3;
            node2.left = node4;
            node3.left = node5;
            node3.right = node6;
            return root;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
}
