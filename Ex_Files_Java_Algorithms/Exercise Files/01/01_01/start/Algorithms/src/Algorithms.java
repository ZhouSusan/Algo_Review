public class Algorithms {

    // Using the Java Streams API, we'll create a character stream that streams through the characters and checks that every character is uppercase.
    public static boolean isUpperCase(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.chars().allMatch(Character::isUpperCase); // Java Stream Api
    }

    // Using the Java Streams API, we'll create a character stream that streams through the characters and checks that every character is lowercase.
    public static boolean isLowerCase(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        // s.chars().noneMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("hello"));
        System.out.println(isUpperCase("HELLO"));

        System.out.println(isLowerCase("hello"));
        System.out.println(isLowerCase("HELLO"));
    }
}
