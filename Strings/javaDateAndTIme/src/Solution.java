import java.time.LocalDate;

public class Solution {
    /**
     * Returns the day of that given date.
     * @param month - integer
     * @param day - integer
     * @param year - integer
     * @return String - the day of the week in capital letters
     */
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String dayOfWeek = date.getDayOfWeek().toString();
        return dayOfWeek;
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 14, 2017));
    }
}