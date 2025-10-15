import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortMap {
  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('d', 3);
    map.put('n', 2);
    map.put('a', 5);

    List<Character> mapKeys = new ArrayList<>(map.keySet());
    Collections.sort(mapKeys);

    Map<Character, Integer> sortedMap = new HashMap<>();
    for (Character key : mapKeys) {
      sortedMap.put(key, map.get(key));
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
