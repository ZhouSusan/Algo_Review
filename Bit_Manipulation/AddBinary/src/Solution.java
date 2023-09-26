public class Solution {
    /**
     * @param a - a binary string consist only of '0' or '1' characters
     * @param b - a binary string consist only of '0' or '1' characters
     * @return String - sum of a + b in binary string
     */
    public static String addBinary(String a, String b){
        StringBuilder sumStr = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while (i >= 0 || j >=0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            carry = sum > 1 ? 1 : 0;
            sumStr.append(sum%2);
        }

        if(carry > 0) {
            sumStr.append(carry);
        }
        return sumStr.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }
}