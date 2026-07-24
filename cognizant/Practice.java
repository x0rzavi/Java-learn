import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Practice {
  public static void main(String[] args) {
    String[] arr = {"Banana", "Apple", "Orange", "Mango"};
    List<String> list = Arrays.stream(arr)
      .map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println(list);
  }
}
