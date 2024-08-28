public class MyFirstApp {
  public static void main (String[] args) {
    System.out.println("I Rule!");
    System.out.println("The World");

    // Statements
    int x = 3;
    String name = "Dirk";
    x = x * 17;
    System.out.println("x is " + x);
    double d = Math.random();
    
    // Loops
    while (x > 12) {
      x = x - 1;
    }

    for (int i = 0; i < 10; i = i + 1) {
      System.out.println("i is now " + i);
    }

    // Branching
    if (x == 10) {
      System.out.println("x must be 10");
    } else {
      System.out.println("x isn't 10");
    }

    if ((x < 3) && (name.equals("Dirk"))) {
      System.out.println("Gently");
    }
    System.out.println("This line runs no matter what");
  }
}
