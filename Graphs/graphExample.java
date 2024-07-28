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
    
    }
}