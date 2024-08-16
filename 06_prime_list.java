import java.util.*;

class PrimeList {
    public static void printPrimeList(int lower, int upper) {
        System.out.print("List of primes between " + lower + " & " + upper + ": ");
        for (int i = lower; i <= upper; i++) {
            if (IsPrime.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Usage Main <lower_limit> <upper_limit>");
        } else {
            int lower = Integer.parseInt(args[0]);
            int upper = Integer.parseInt(args[1]);

            PrimeList.printPrimeList(lower, upper);
        }
    }
}