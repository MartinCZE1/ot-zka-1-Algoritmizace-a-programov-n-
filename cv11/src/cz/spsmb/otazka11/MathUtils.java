package cz.spsmb.otazka11;

public class MathUtils {
    public static boolean isPrimeNumber(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
