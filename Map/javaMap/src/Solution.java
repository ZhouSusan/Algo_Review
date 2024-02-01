import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> phoneAddressBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneAddressBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phoneAddressBook.containsKey(s)) {
                System.out.println(s + "=" + phoneAddressBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}