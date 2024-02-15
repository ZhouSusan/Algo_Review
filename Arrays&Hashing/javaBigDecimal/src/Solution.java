import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] numStringsArr = new String[length];

        for(int i=0; i<length ;i++)
        {
            numStringsArr[i] = sc.next();
        }

        Arrays.sort(numStringsArr, new Comparator<Object>() {

            public int compare(Object s1, Object s2) {
                BigDecimal bd1 = new BigDecimal((String)s1);
                BigDecimal bd2 = new BigDecimal((String)s2);
                return bd2.compareTo(bd1);
            }
        });

        for (String str : numStringsArr) {
            System.out.println(str);
        }

        sc.close();
    }
}