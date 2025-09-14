// https://ibb.co/0yZDQJkP
import java.util.Scanner;

public class q6 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Input1: ");
      int num = sc.nextInt();
      sc.nextLine(); // consume the leftover newline
      System.out.print("Input2: ");
      String word = sc.nextLine();

      int luckyNum = 0, temp = 0;
      for (int i = 0; i < num; ++i) {
        temp = (int) word.charAt(i) * (i + 1);
        if ((i + 1) % 2 != 0 || (int) word.charAt(i) % 2 != 0) {
          luckyNum += temp;
        }
      }
      System.out.println(luckyNum);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
