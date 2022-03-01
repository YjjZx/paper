package yjj;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        System.out.println();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        System.out.println(result);
        System.out.println(result.size());
        List<Integer> a =new ArrayList<Integer>();
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
//        result.add(new ArrayList<>());
//        System.out.println(result);
        System.out.println(result.add(a));
        System.out.println(result);
        System.out.println(result.size());





    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                counts[str.charAt(i) - 'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> List = map.getOrDefault(key, new ArrayList<String>());
            List.add(str);
            map.put(key,List);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
