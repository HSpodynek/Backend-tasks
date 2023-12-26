import java.util.*;

public class Task3 {
    private Map<Long, Set<Long>> adjList;

    public Task3() {
        adjList = new HashMap<>();
    }

    public void addEdge(long a, long b) {
        adjList.putIfAbsent(a, new HashSet<>());
        adjList.putIfAbsent(b, new HashSet<>());
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }

    public int countComponents() {
        Set<Long> visited = new HashSet<>();
        int components = 0;

        for (long node : adjList.keySet()) {
            if (!visited.contains(node)) {
                exploreIterative(node, visited);
                components++;
            }
        }

        return components;
    }

    private void exploreIterative(long start, Set<Long> visited) {
        Stack<Long> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            long node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                for (long neighbor : adjList.get(node)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of edges:");
        int n = scanner.nextInt();

        Task3 graph = new Task3();

        System.out.println("Enter the edges:");
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            graph.addEdge(a, b);
        }

        int components = graph.countComponents();
        System.out.println("Number of separate graphs: " + components);

        scanner.close();
    }
}
