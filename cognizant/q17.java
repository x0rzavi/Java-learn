// https://ibb.co/HfLmV7p3
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;

public class q17 {
  public static int maxBalloons(int N, int X, int[] A, int[] B) {
    int maxBalloons = -1;

    // Use a nested loop to check every possible pair of packets.
    // The outer loop picks the first packet.
    for (int i = 0; i < N; i++) {
      // The inner loop picks the second packet, starting from the next index.
      // This prevents re-checking pairs and using the same packet twice.
      for (int j = i + 1; j < N; j++) {

        // Check if the combined cost is within the budget X.
        if (B[i] + B[j] <= X) {
          // Calculate the number of balloons for the current pair.
          int currentBalloons = A[i] + A[j];

          // Update the maximum number of balloons found so far.
          if (currentBalloons > maxBalloons) {
            maxBalloons = currentBalloons;
          }
        }
      }
    }

    return maxBalloons;
  }

  // wrong! flawed logic
  public static int maxBalloonCount(int length, int budget, int[] numBalloonsEach, int[] costEach) {
    Map<Integer, Integer> map = new TreeMap<>(); // sorted map

    for (int i = 0; i < length; ++i) {
      map.put(costEach[i], numBalloonsEach[i]);
    }

    Arrays.sort(costEach);
    int left = 0;
    int right = length - 1;
    int currSum = Integer.MIN_VALUE;
    while (left < right) {
      if (costEach[left] + costEach[right] <= budget) {
        // System.out.println(map.get(costEach[left]) + " " + map.get(costEach[right]));
        currSum = Math.max(currSum, map.get(costEach[left]) + map.get(costEach[right]));
        ++left;
      } else if (costEach[left] + costEach[right] > budget) {
        --right;
      }
    }

    return currSum == Integer.MIN_VALUE ? -1 : currSum;
  }

  public static void main(String[] args) {
    int length = 4;
    int budget = 8;
    int[] numBalloonsEach = { 4, 6, 2, 7 };
    int[] costEach = { 5, 3, 1, 6 };
    System.out.println(maxBalloons(length, budget, numBalloonsEach, costEach));
  }
}
