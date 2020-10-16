
// Java program For handling Input/Output 
import java.io.*;
import java.util.*;
//import java.math.*;
//import java.awt.*;

public class Main {
    BufferedReader br;
    StringTokenizer st;

    int max = -1;
    final long P = 998244353;
    final long P2 = 1000000007;

    HashSet<String> set = new HashSet<>();
    HashMap<Character, List<Integer>> map = new HashMap<>();

    // actual logic
    void solve() throws IOException {
        int n = ni();
        int q = ni();
        Map<Integer, List<Integer>> g = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            g.put(i, new LinkedList<Integer>());
        }
        for (int i = 0; i < q; i++) {
            int x = ni();
            int y = ni();
            g.get(x).add(y);
            g.get(y).add(x);
        }
        System.out.println(g);
        boolean visited[] = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        rdfs(1, visited, g);

        boolean v[] = new boolean[n + 1];
        System.out.println("\n----------------------------------------------------------------");
        stack.push(1);
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            System.out.println(temp);
            v[temp] = true;

            for (int i : g.get(temp)) {
                if (!v[i]) {
                    v[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    void rdfs(int v, boolean visited[], Map<Integer, List<Integer>> g) {
        System.out.println(v);
        visited[v] = true;

        List<Integer> l = g.get(v);
        for (int i = 0; i < l.size(); i++) {
            if (!visited[l.get(i)]) {
                rdfs(l.get(i), visited, g);
            }
        }
    }

    // constructor
    Main() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    Main(String s) {
        try {
            br = new BufferedReader(new FileReader(s));
            st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // main metohd
    public static void main(String[] args) throws IOException {
        new Main("input.txt").solve();
    }

    // Utility methods

    String ns() {
        if (!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return st.nextToken();

    }

    int ni() {
        return Integer.parseInt(ns());
    }

    long nl() {
        return Long.parseLong(ns());
    }

    double nd() {
        return Double.parseDouble(ns());
    }

    void pl(String s) {
        System.out.println(s);
    }

    void pl(long s) {
        System.out.println(s);
    }

    void pl(double s) {
        System.out.println(s);
    }
}
