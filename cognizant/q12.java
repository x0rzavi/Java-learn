// https://ibb.co/6RwJft9x
import java.util.Scanner;

public class q12 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int num = sc.nextInt();

      if (num == 0) {
        System.out.println("No Factors");
        return;
      }
      if (num < 0) num = Math.abs(num);

      for (int i = 1; i < num; ++i) {
        if (num % i == 0) {
          System.out.print(i + ", ");
        }
      }
      System.out.println(num);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
}
