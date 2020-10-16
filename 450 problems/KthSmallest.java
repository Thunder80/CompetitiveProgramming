import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.ni();
        int k = fr.ni();
        PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            long temp = fr.nl();
            q.add(temp);
            if (q.size() > k)
                q.poll();
        }

        fr.p(q.peek());
    }
}
