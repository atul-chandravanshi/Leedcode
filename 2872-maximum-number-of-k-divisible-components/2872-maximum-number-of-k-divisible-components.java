class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // Result to track the number of components
        int[] result = new int[1];

        // DFS Helper to compute subtree sums
        dfs(0, -1, graph, values, k, result);

        return result[0];
    }

    static int dfs(int node, int parent, List<List<Integer>> graph, int[] values, int k, int[] result) {
        // Compute subtree sum modulo k
        long currentSum = values[node] % k;

        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                currentSum += dfs(neighbor, node, graph, values, k, result);
                currentSum %= k; // Keep the sum manageable
            }
        }

        // If the subtree sum is divisible by k, it forms a valid component
        if (currentSum % k == 0) {
            result[0]++;
            return 0; // Reset for this subtree
        }

        return (int) currentSum; // Propagate remainder
    }
}
