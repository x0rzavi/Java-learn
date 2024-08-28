public class IfTest {
  public static void main (String[] args) {
    int x = 2;
    if (x == 3) {
      System.out.println("x must be 3");
    } else {
      System.out.print("x is not 3"); // keep printing to same line
    }
    System.out.println("Runs no matter what");
  }
}
