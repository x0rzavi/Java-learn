// https://ibb.co/XkyVJrq3
import java.util.Scanner;

public class q11 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int numItems = sc.nextInt();
      sc.nextLine(); // consume remaining newline
      String[] items = new String[numItems];
      int[] price = new int[numItems];
      int[] disPerc = new int [numItems];
      int[] discount = new int[numItems];

      for (int i = 0; i < numItems; ++i) {
        String[] item = sc.nextLine().split(",");
        items[i] = item[0];
        price[i] = Integer.parseInt(item[1]);
        disPerc[i] = Integer.parseInt(item[2]);
        discount[i] = disPerc[i] * price[i] / 100;
      }

      int minDiscount = Integer.MAX_VALUE;
      for (int i = 0; i < numItems; ++i) {
        minDiscount = Math.min(minDiscount, discount[i]);
      }

      for (int i = 0; i < numItems; ++i) {
        if (discount[i] == minDiscount) {
          System.out.println(items[i]);
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
