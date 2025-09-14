// https://ibb.co/0ymMCxHd
import java.util.Scanner;

public class q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the car no:");
    int num = sc.nextInt();
    sc.close();

    if (num < 1000 || num > 9999) {
      System.out.println(num + " is not a valid car number");
      return;
    }

    int numSum = 0;
    while (num != 0) {
      numSum += num % 10;
      num /= 10;
    }

    if (numSum % 3 == 0 || numSum % 5 == 0 || numSum % 7 == 0) {
      System.out.println("Lucky number");
    } else {
      System.out.println("Sorry its not my lucky number");
    }
  }
}
