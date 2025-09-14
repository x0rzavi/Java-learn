// https://ibb.co/qFF4BqCr
import java.util.Arrays;

public class q5 {
  public static int minOperations(int N, int[] A) {
    int numOper = 0;
    Arrays.sort(A);

    for (int i = 0; i < N; ++i) {
      if (A[i] < i + 1) {
        numOper += i + 1 - A[i];
      }
    }

    return numOper;
  }

  public static void main(String[] args) {
    int N = 5;
    int[] A = {1, 1, 2, 2, 3};
    System.out.println(minOperations(N, A));
  }
}
