package dev.joserg;

public class FizzBuzz {
    public static String of(Integer number) {
        if (isFizzBuzz(number)) return "FizzBuzz";
        if (isBuzz(number)) return "Buzz";
        if (isFizz(number)) return "Fizz";
        return number.toString();
    }

    private static boolean isFizzBuzz(Integer number) {
        return isFizz(number) && isBuzz(number);
    }

    private static boolean isBuzz(Integer number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(Integer number) {
        return number % 3 == 0;
    }
}
