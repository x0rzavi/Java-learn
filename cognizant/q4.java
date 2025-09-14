// https://ibb.co/Z9RtBd2
import java.util.Arrays;
import java.util.Set;
import java.util.stream.*;

public class q4 {
  public static void main(String[] args) {
    int[] n1 = {100, 101, 102, 103, 104};
    int[] n2 = {101, 103, 105, 107, 109};
    Set<Integer> n1Set = Arrays.stream(n1)
                               .boxed()
                               .collect(Collectors.toSet());
    Set<Integer> n2Set = Arrays.stream(n2)
                               .boxed()
                               .collect(Collectors.toSet());
    n1Set.retainAll(n2Set);
    System.out.println(n1Set);
  }
}
