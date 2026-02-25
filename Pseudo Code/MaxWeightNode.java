import java.util.*;

public class MaxWeightNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] edge = new int[N];

            for (int i = 0; i < N; i++) {
                edge[i] = sc.nextInt();
            }

            int[] weight = new int[N];

            // Calculate weights
            for (int i = 0; i < N; i++) {
                if (edge[i] != -1) {
                    weight[edge[i]] += i;
                }
            }

            // Find node with max weight
            int maxNode = 0;
            int maxWeight = weight[0];

            for (int i = 1; i < N; i++) {
                if (weight[i] > maxWeight || 
                   (weight[i] == maxWeight && i > maxNode)) {
                    maxWeight = weight[i];
                    maxNode = i;
                }
            }

            System.out.println(maxNode);
        }
        sc.close();
    }
}
