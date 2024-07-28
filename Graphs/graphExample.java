import java.util.*;

class edge {
    int src, dest, weight;

    edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "(" + src + " -> " + dest + ", " + weight + ")";
    }
}

class graphExample {
    
    public static void main(String[] args) {
        int[][] g = { { 0, 1, 3 }, { 1, 2, 1 }, { 1, 3, 4 }, { 2, 3, 1 } };
        int n = 4; // number of vertices
        List<List<edge>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<>());
        }
        for (int[] a : g) { // bidirectional graph
            l.get(a[0]).add(new edge(a[0], a[1], a[2]));
            l.get(a[1]).add(new edge(a[1], a[0], a[2]));
        }

        // for unidirectional graph
        // for (int[] a : g) {
        //     l.get(a[0]).add(new edge(a[0], a[1], a[2]));
        // }
        System.out.println(l);
        arrayToGraph(g, n);
        anotherRepresentation(n, g);
    }

    // Another way to convert array to graph
    public static void arrayToGraph(int[][] a, int n) {
        Map<Integer, List<int[]>> graph = new HashMap<>();

        // for multidirectional graph
        for (int[] r : a) {
            List<int[]> l = graph.get(r[0]);
            if (l == null) {
                l = new ArrayList<>();
                graph.put(r[0], l);
            }
            l.add(new int[] { r[1], r[2] });

            l = graph.get(r[1]);
            if (l == null) {
                l = new ArrayList<>();
                graph.put(r[1], l);
            }
            l.add(new int[] { r[0], r[2] });
        }
        for (Map.Entry<Integer, List<int[]>> entry : graph.entrySet()) {
            System.out.print("Node " + entry.getKey() + ":");
            for (int[] edge : entry.getValue()) {
                System.out.print(Arrays.toString(edge) + " ");
            }
            System.out.println();
        }
    }

    public static void anotherRepresentation(int n, int[][] a) {
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : a) {
            int src = edge[0], dest = edge[1], weight = edge[2];
            graph[src].add(new int[] { dest, weight });
            graph[dest].add(new int[] { src, weight }); // for bidirectional graph
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + i + ":");
            for (int[] edge : graph[i]) {
                System.out.print(Arrays.toString(edge) + " ");
            }
            System.out.println();
        }
    }
}