package com.rudy.study;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        inOrder(root);
        return list;
    }

    private void inOrder(Node root) {
        if (root == null) return;
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            inOrder(root.children.get(i));
        }
    }
}
