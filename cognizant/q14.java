// https://ibb.co/Z1HmDp7s
public class q14 {
  public static boolean isRtoG(int a, int b) {
    if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
      return false;
    } else if (a % 2 == 0 && b % 2 != 0) {
      return false;
    } else {
      return true;
    }
  }
  public static void main(String[] args) {
    int[] arr = {70, 23, 13, 26, 72, 19};
    // int[] arr = {1, 2, 1, 6, 10, 9};
    int count = 0;
    
    for (int i = 1; i < arr.length; ++i) {
      if (isRtoG(arr[i - 1], arr[i])) {
        ++count;
      }
    }
    System.out.println(count);
  }
}
