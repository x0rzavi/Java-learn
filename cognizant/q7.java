// https://ibb.co/8ncn8rCf
import java.util.stream.*;

public class q7 {
  public static int arrRangeSum(int[] arr, int left, int right) {
    return IntStream.range(left, right).map(i -> arr[i]). sum();
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 10, 20, 30};
    int mid = arr.length / 2;
    if (arrRangeSum(arr, 0, mid) < arrRangeSum(arr, mid, arr.length)) {
      int left = 0, right = arr.length - 1;
      while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        ++left;
        --right;
      }
    }

    for (int num : arr) {
      System.out.print(num + ", ");
    }
  }
}
