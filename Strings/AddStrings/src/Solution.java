public class Solution {

    /**
     * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
     * @param num1 - non-negative integers represented as string
     * @param num2 - non-negative integers represented as string
     * @return sum - sum of num1 and num2 as a string
     */
    public static String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder total = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = num1.charAt(i) - '0';
            }

            if (j >= 0) {
                b = num2.charAt(j) - '0';
            }

            int sum = a + b + carry;
            carry = sum/10;
            total.append(sum % 10);
            i--;
            j--;
        }

        if (carry != 0) {
            total.append(carry);
        }
        return total.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "456", num2 = "77";
        System.out.println(addStrings(num1, num2));
    }
}