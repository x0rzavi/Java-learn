// https://ibb.co/7dpLkNVW
public class q8 {
  public static int countValidSubArrays(int[] arr, int length) {
    int count = 0;
    for (int right = 2; right < length; ++right) {
      int sum = arr[right - 2] + arr[right];
      if (sum == arr[right - 1]) {
        ++count;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 3, 5, 2, 4, 2 };
    int length = 8;
    System.out.println(countValidSubArrays(arr, length));
  }
}
