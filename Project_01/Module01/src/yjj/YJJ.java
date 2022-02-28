package yjj;

import java.util.HashMap;
import java.util.Map;

public class YJJ {
    public static void main(String[] args) {
        String A ="SDASDAD";
        String B ="SDGHDAD";
        YJJ yjj = new YJJ();
        System.out.println(yjj.isAnagram(A,B));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}

