public class Algorithms {

    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return s;
        }

        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length ; i++) {
            sb.append(reverse(words[i]));
            if (i != words.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String reverse(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return s;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("sally is a great worker"));
        System.out.println(reverseEachWord("racer racecar madam"));
        System.out.println(reverseEachWord("what can I do today"));
    }
}
