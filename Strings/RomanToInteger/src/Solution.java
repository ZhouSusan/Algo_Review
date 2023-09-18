import java.util.HashMap;

public class Solution {
    /**
     * Given a roman numeral, convert it to an integer.
     * @param s -  a string that only contains the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M')
     * @return integer - the number value of the roman numeral
     */
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumberMap = new HashMap<>();
        romanNumberMap.put('I', 1);
        romanNumberMap.put('V', 5);
        romanNumberMap.put('X', 10);
        romanNumberMap.put('L', 50);
        romanNumberMap.put('C', 100);
        romanNumberMap.put('D', 500);
        romanNumberMap.put('M', 1000);
        int sum = 0;

        for (int i = 1; i < s.length(); i++) {
            int previous = romanNumberMap.get(s.charAt(i-1));
            int current = romanNumberMap.get(s.charAt(i));
            if (previous < current) {
                sum -= previous;
            } else {
                sum += previous;
            }
        }
        sum += romanNumberMap.get(s.charAt(s.length()-1));
        return sum;
    }
    public static void main(String[] args) {
        String str1 = "III";
        System.out.println(romanToInt(str1));
    }
}