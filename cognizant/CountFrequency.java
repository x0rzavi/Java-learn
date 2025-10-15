import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter input: ");
      String input = sc.nextLine();
      Map<Character, Integer> map = new HashMap<>();

      for (char ch : input.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
      }

      System.out.println(map);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
