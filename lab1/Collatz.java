/**
 * Class that prints the Collatz sequence starting from a given number.
 *
 * @author Joe Ho
 */
public class Collatz {

    /**
     * Buggy implementation of nextNumber!
     */
    public static int nextNumber(int n) {
        if (n == 1) {
            return 1;
        }

        if (isEven(n)) {
            return getNextEven(n);
        }

        return getNextOdd(n);
    }

    private static int getNextOdd(int n) {
        return n * 3 + 1;
    }

    private static int getNextEven(int n) {
        return n / 2;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

