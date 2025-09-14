// https://ibb.co/Nd2nYbBJ
public class q18 {
  public static void main(String[] args) {
    String str = "abc10a";
    int left = 0;
    int right = 1;
    int maxDist = 0;

    while (right < str.length()) {
      if (str.charAt(right) != str.charAt(left)) {
        maxDist = Math.max(maxDist, right - left);
        ++right;
        continue;
      } else {
        ++left;
      }

      ++right;
    }
    System.out.println(maxDist);
  }
}
