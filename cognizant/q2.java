// https://ibb.co/ks8KcdjW
import java.util.Scanner;

public class q2 {
  public static boolean isPalindrome() {
    System.out.print("Enter a number: ");

    try (Scanner sc = new Scanner(System.in)) {
      int num = sc.nextInt();
      if (num < 0) {
        System.out.println("Invalid Input");
        return false;
      } else {
        String temp = String.valueOf(num);
        int left = 0, right = 0;
        while (left < right) {
          if (temp.charAt(left) != temp.charAt(right)) {
            return false;
          }
          ++left;
          --right;
        }
        return true;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return false;
  }

  public static void main(String[] args) {
    if (isPalindrome()) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
}
