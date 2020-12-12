package com.lzhenxing.myproject.algorithm.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lzhenxing.myproject.algorithm.tree.TreeNode;

/**
 *   ClassName: LeetCode257SumTree <br/>   Function: <br/>
 *
 *  给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 *  说明: 叶子节点是指没有子节点的节点。
 *
 *  输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * @author zhenxing.liu
 * @date 2020/12/12
 */
public class LeetCode257SumTree {

    /**
     * 广度优先算法实现
     * @param root
     * @return
     */
    public static List<String> treePaths(TreeNode root){
        if(root == null){
            return null;
        }
        List<String> result = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(String.valueOf(root.value));
        while(root != null && !nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();
            if(node.left == null && node.right == null){
                result.add(path);
            }else{
                if(node.left != null){
                    pathQueue.offer(new StringBuilder(path).append("->").append(node.left.value).toString());
                    nodeQueue.offer(node.left);
                }
                if(node.right != null){
                    pathQueue.offer(new StringBuilder(path).append("->").append(node.right.value).toString());
                    nodeQueue.offer(node.right);
                }
            }
        }
        return result;
    }


    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    /**
     * 深度优先搜索
     * @param root
     * @param path
     * @param paths
     */
    public static void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(root.value);
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }

    /**
     * 节点为（0-9）
     * 求节点路径和，1->3->5 则表示 135，
     * 路径和：124 + 135 + 136 = 395
     * @param root
     * @return
     */
    public static int sumTreePaths(TreeNode root){
        if(root == null){
            return 0;
        }
        int result = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(root.value);
        while(root != null && !nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            int path = pathQueue.poll();
            if(node.left == null && node.right == null){
                result += path;
            }else{
                if(node.left != null){
                    pathQueue.offer(path * 10 + node.left.value);
                    nodeQueue.offer(node.left);
                }
                if(node.right != null){
                    pathQueue.offer(path * 10 + node.right.value);
                    nodeQueue.offer(node.right);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        TreeNode root = TreeNode.initTree();
        System.out.println(treePaths(root));
        System.out.println(binaryTreePaths(root));
        System.out.println(sumTreePaths(root));
    }

}
