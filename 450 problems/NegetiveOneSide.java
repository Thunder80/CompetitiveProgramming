public class NegetiveOneSide {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.ni();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        int low = 0, high = n - 1;

        while (low <= high) {
            if (a[low] > 0) {
                long t = a[low];
                a[low] = a[high];
                a[high] = t;
                high--;
            } else {
                low++;
            }
        }

        fr.pra(a);
    }
}
