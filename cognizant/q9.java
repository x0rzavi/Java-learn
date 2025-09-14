// https://ibb.co/4wL97tMn
import java.util.Scanner;

public class q9 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the salary");
      double salary = sc.nextDouble();
      System.out.println("Enter the Performance appraisal rating");
      double rating = sc.nextDouble();

      if (salary < 0 || (rating < 1 || rating > 5)) {
        System.out.println("Invalid Input");
        return;
      }

      double increment = 0;
      if (rating >= 1 && rating <= 3) increment = 0.10 * salary;
      if (rating >= 3.1 && rating <= 4) increment = 0.25 * salary;
      if (rating >= 4.1 && rating <= 5) increment = 0.30 * salary;

      System.out.println(salary + increment);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
