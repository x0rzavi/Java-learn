// https://ibb.co/gb8z3tNP
public class q15 {
  public static int bubbleSort(int length, int[] arr, boolean asc) {
    int numSwaps = 0;

    boolean swapped = true;
    while (swapped) {
      swapped = false;
      for (int i = 0; i < length - 1; ++i) {
        boolean condition = asc ? (arr[i] > arr[i + 1]) : (arr[i] < arr[i + 1]);
        if (condition) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
          ++numSwaps;
        }
      }
    }

    return numSwaps;
  }
  public static int minPossibleSum(int input1, int[] input2, int[] input3) {
    int numSwapsAsc = bubbleSort(input1, input2, true);
    int numSwapsDesc = bubbleSort(input1, input3, false);

    int sum = 0;
    for (int i = 0; i < input1; ++i) {
      sum += input2[i] * input3[i];
    }

    System.out.println(numSwapsAsc + " " + numSwapsDesc);
    return sum;
  }

  public static void main(String[] args) {
    int input1 = 4;
    int[] input2 = {1, 4, 3, 2};
    int[] input3 = {5, 2, 4, 1};
    System.out.println(minPossibleSum(input1, input2, input3));
  }
}
