// https://ibb.co/VcTDzjWy
import java.util.Scanner; 

public class q3 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      int lastDigit = num % 10;
      if (lastDigit == 7 || num % 7 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println("Not buzz");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
