package com.rudy.study;

import java.util.HashMap;

public class BuildTree {
    public static void main(String[] args) {
        BuildTree build1e = new BuildTree();
        build1e.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }

    //新建一个树，需要新建每一个节点以及他的左右子节点
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        TreeNode treeNode = creatTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return treeNode;
    }

    private TreeNode creatTree(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        //1.终止条件
        if (pStart > pEnd || iStart > iEnd) return null;
        //2.处理当前层
        TreeNode treeNode = new TreeNode(preorder[pStart]);
        int head = hashMap.get(preorder[pStart]);
        //3.调用下一层
        treeNode.left = creatTree(preorder, pStart + 1, pStart + (head - iStart), inorder, iStart, head - 1);
        treeNode.right = creatTree(preorder, pStart + (head - iStart) + 1, pEnd, inorder, head + 1, iEnd);
        //4.清空数据，还原
        return treeNode;
    }
}
