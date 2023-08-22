public class VersionNumberComparator {

    /**
     * Determines which version number is greater or if they are equal.
     * @param v1 - String A
     * @param v2 - String B
     * @return number - 1 if v1 greater, -1 if v1 smaller, 0 if equal
     */
    public static int compareVersion(String v1, String v2) {
        if (v1 == null && v2 == null) {
            return 0;
        }

        if (v1 == null && v2 != null) {
            return -1;
        }

        if (v1 != null && v2 == null) {
            return 1;
        }

        if (v1.isEmpty() && v2.isEmpty()) {
            return 0;
        }

        if (v1.isEmpty() && v2.length() > 0) {
            return -1;
        }

        if (v1.length() > 0 && v2.isEmpty()) {
            return 1;
        }

        String[] v1Arr = v1.split("\\.");
        String[] v2Arr = v2.split("\\.");

        int maxArrayLength = Math.max(v1Arr.length, v2Arr.length);
        for (int i = 0; i < maxArrayLength; i++) {
            Integer version1 = i < v1Arr.length ? Integer.parseInt(v1Arr[i]) : 0;
            Integer version2 = i < v2Arr.length ? Integer.parseInt(v2Arr[i]) : 0;

            int compare = version1.compareTo(version2);

            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String testOneV1 = "0.1";
        String testOneV2 = "1.1";
        System.out.println(compareVersion(testOneV1, testOneV2));

        String testTwoV1 = "1.0.1";
        String testTwoV2 = "1";
        System.out.println(compareVersion(testTwoV1,testTwoV2));

        String testThreeV1 = "1.01";
        String testThreeV2 = "1.001";
        System.out.println(compareVersion(testThreeV1,testThreeV2));

        String testFourV1 = null;
        String testFourV2 = "1.001";
        System.out.println(compareVersion(testFourV1,testFourV2));
     }
}
