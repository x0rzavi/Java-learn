// https://ibb.co/4n409G6H
import java.util.ArrayList;
import java.util.List;

public class q20 {
    public static int count = 0;

    public static void backtrack(int n, boolean[] used, List<Integer> currentPermutation) {
        if (currentPermutation.size() == n) {
            ++count;
            return;
        }

        for (int i = 1; i <= n; ++i) {
            if (!used[i]) {
                if (currentPermutation.isEmpty()
                        || Math.abs(currentPermutation.get(currentPermutation.size() - 1) - i) != 1) {
                    used[i] = true;
                    currentPermutation.add(i);
                    backtrack(n, used, currentPermutation);
                    currentPermutation.remove(currentPermutation.size() - 1);
                    used[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        boolean[] used = new boolean[n + 1];
        List<Integer> currentPermutation = new ArrayList<>();
        backtrack(n, used, currentPermutation);
        System.out.println(count);
    }
}
