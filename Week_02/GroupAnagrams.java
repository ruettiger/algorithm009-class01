package com.rudy.study;

import java.util.ArrayList;
import java.util.List;

//这个算法写的不好，有待优化
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length - 1; i++) {
            list.clear();
            if (!used[i]) {
                list.add(strs[i]);
                used[i] = true;
            }
            for (int j = i + 1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j]) && !used[j]) {
                    list.add(strs[j]);
                    used[j] = true;
                }
            }
            if (list.size() >0){
                lists.add(list);
            }
        }
        return lists;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] count = new int[26];
        for (int i = 0; i < sChars.length; i++) {
            count[sChars[i] - 'a']++;
        }
        for (int i = 0; i < tChars.length; i++) {
            count[tChars[i] - 'a']--;
            if (count[tChars[i] - 'a'] < 0) return false;
        }
        return true;
    }
}
