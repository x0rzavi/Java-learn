// https://ibb.co/rRrymMb0
import java.util.Scanner;

public class q16 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int sum = 0;
      for (int i = 0; i < n; ++i) {
        int nextPos = (i + 1) % n;
        int prevPos = (i - 1 + n) % n;
        // System.out.println(prevPos + " " + i + " " + nextPos);
        if ((nextPos + 1) % 5 == 0 || (prevPos + 1) % 5 == 0) {
          sum += 2 + (i + 1);
        } else {
          sum += (i + 1);
        }
      }
      System.out.println(sum);
    } catch (Exception e) {
      System.out.println(e);
    } 
  }
  
}
