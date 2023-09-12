import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * @param strs<String>- an array of strings that consists of lowercase letters.
     * @return  List<List<String>> - a list of group anagrams
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap  = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            if(anagramMap.containsKey(sorted)) {
                anagramMap.get(sorted).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                anagramMap.put(sorted, temp);
            }
        }
        System.out.println(anagramMap.values());
        return new ArrayList<>(anagramMap.values());
    }
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
       System.out.println(groupAnagrams(strs));
    }
}