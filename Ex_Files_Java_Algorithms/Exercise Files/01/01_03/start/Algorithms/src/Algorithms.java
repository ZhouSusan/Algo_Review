public class Algorithms {
    public static String normalizeString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.toLowerCase().trim().replace(",", "");
    }
    public static void main(String[] args) {
        System.out.println(normalizeString("     Hello There, BUDDY  "));
    }
}
