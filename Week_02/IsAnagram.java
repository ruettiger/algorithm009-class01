import java.util.Arrays;
public class IsAnagram {
    //1.排序Sort
    //2.计数器方法
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] count = new int[26];
        for (int i = 0; i < sChars.length; i++) {
            count[sChars[i] - 'a']++;
            count[tChars[i] - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    public boolean isAnagram3(String s, String t) {
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
