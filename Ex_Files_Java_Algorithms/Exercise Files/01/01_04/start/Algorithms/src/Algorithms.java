public class Algorithms {
    public static void parseContents(String s) {
        for (char c: s.toCharArray()) {
            System.out.print(c);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));

        parseContents(s);
    }
}
