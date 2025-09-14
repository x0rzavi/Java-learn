// https://ibb.co/6RQksqXh
public class q13 {
  public static int numMagicalRows(int input1, int input2, int[][] input3) {
    int count = 0;

    for (int i = 0; i < input1; ++i) {
      int sum = 0;
      for (int j = 0; j < input2; ++j) {
        if (input3[i][j] % 2 != 0) sum += input3[i][j];
      }
      if (sum % 2 == 0) ++count;
    }

    return count;
  }

  public static void main(String[] args) {
    int input1 = 3;
    int input2 = 3;
    int[][] input3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(numMagicalRows(input1, input2, input3));
  }
}
