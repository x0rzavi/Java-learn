import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NumberTheory {
  public static boolean isPrime(int n) {
    if (n < 2)
      return false;

    // 2 is the only even Prime
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;

    // only check odd numbers from now on
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static List<Integer> sieveOfEratosthenes(int n) {
    List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true)); // fill the list
    isPrime.set(0, false);
    isPrime.set(1, false);

    for (int i = 2; i * i <= n; ++i) {
      if (isPrime.get(i)) {
        for (int j = i * i; j <= n; j += i) {
          isPrime.set(j, false);
        }
      }
    }

    List<Integer> primes = new ArrayList<>();
    for (int i = 2; i <= n; ++i) {
      if (isPrime.get(i))
        primes.add(i);
    }

    return primes;
  }

  public static List<Integer> primeFactorization(int n, List<Integer> primes) throws Exception {
    List<Integer> primeFactors = new ArrayList<>();
    for (Integer prime : primes) {
      if (prime * prime > n)
        break;
      while (n % prime == 0) {
        primeFactors.add(prime);
        n /= prime;
      }
    }

    if (n > 1)
      primeFactors.add(n); // n is a prime factor itself; applied prime*prime earlier

    return primeFactors;
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int remainder = a % b;
      a = b;
      b = remainder;
    }
    return a;
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static double fastExponentiation(double base, int exponent) {
    class InnerHelper {
      static double helper(double base, int exponent) {
        if (base == 0)
          return 0;
        if (exponent == 0)
          return 1;

        int absExponent = Math.abs(exponent); // deal with -ve later
        if (absExponent % 2 == 0) {
          return Math.pow(helper(base, absExponent / 2), 2);
        } else {
          return base * helper(base, absExponent - 1);
        }
      }
    }

    double result = InnerHelper.helper(base, exponent);
    return exponent < 0 ? 1 / result : result;
  }
}