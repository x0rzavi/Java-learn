// https://ibb.co/fcQtz4F
import java.util.Arrays;

public class q19 {
  public static void main(String[] args) {
    int[] arr = { 5, 3, 2, 8 };
    int hours = 10;

    // greedy knapsack approach
    // can't apply 2 pointers contiguous not guaranteed
    Arrays.sort(arr);

    int booksRead = 0;
    int hoursSpent = 0;

    // Iterate through the sorted array.
    for (int i = 0; i < arr.length; i++) {
      // Check if adding the current book's time will exceed the budget.
      if (hoursSpent + arr[i] <= hours) {
        hoursSpent += arr[i];
        booksRead++;
      } else {
        // If it exceeds the budget, we can't read any more books.
        break;
      }
    }

    System.out.println(booksRead);
  }
}
