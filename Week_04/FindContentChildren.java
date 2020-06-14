package com.rudy.study;

import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int max = 0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            if(j == s.length) break;
            for (; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    max++;
                    j++;
                    break;
                }
            }
        }
        return max;
    }
}
