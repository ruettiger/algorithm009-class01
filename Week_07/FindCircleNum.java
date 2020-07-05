package com.rudy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class FindCircleNum {
    public int findCircleNum(int[][] M) {
        int res = 0;
        Set<Integer> visitedSet = new HashSet<>();
        LinkedList<Integer> q = new LinkedList<>();
        //BFS
        for (int i = 0; i < M.length; i++) {
            if (!visitedSet.contains(i)) {
                BFS(M, i, q, visitedSet);
                res++;
            }
        }
        return res;
    }

    public void BFS(int[][] M, int i, LinkedList<Integer> q, Set<Integer> visitedSet) {
        q.addLast(i);
        while (!q.isEmpty()) {
            Integer student = q.removeFirst();
            visitedSet.add(student);
            for (int k = 0; k < M[student].length; k++) {
                if (M[student][k] == 1 && !visitedSet.contains(k)) {
                    q.addLast(k);
                }
            }
        }
    }
}