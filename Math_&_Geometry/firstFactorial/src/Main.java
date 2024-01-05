public class Main {
    /**
     *  Takes the given num and return the factorial of it.
     * @param num - integer
     * @return integer - factorial of input num
     */
    public static int firstFactorial(int num) {
        int factorialResult = 1;

        while(num >= 1) {
            factorialResult *= num;
            num--;
        }

        return factorialResult;
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println(firstFactorial(num));
    }
}