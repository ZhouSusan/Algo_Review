import java.util.Scanner;

public class UsernameValidator {
    /**
     * Checks if the username is considered valid.
     * @param username - string that contains alphanumeric characters and underscores (_)
     * @return boolean
     */
    public static boolean isValidUsername(String username) {
        String pattern = "^[a-zA-Z][\\w]{7,29}$";
        if (username.matches(pattern)) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfUsername = Integer.parseInt(scan.nextLine());

        while (numberOfUsername > 0) {
            String currentUserName = scan.nextLine();

            if (isValidUsername(currentUserName)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            numberOfUsername--;
        }

        scan.close();
    }
}