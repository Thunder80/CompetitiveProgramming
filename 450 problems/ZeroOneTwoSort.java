public class ZeroOneTwoSort {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.ni();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        // Dutch flag algorithm
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                long t = a[low];
                a[low] = a[mid];
                a[mid] = t;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                long t = a[high];
                a[high] = a[mid];
                a[mid] = t;
                high--;
            }
        }

        fr.pra(a);

        // Counting solution
        /*
         * int b[] = new int[3]; for (int i = 0; i < n; i++) { if (a[i] == 0) b[0]++;
         * else if (a[i] == 1) b[1]++; else b[2]++; }
         * 
         * for (int i = 0; i < n; i++) { if (b[0] > 0) { fr.p(0 + " "); b[0]--; } else
         * if (b[1] > 0) { fr.p(1 + " "); b[1]--; } else { fr.p(2 + " "); b[2]--; } }
         */
    }
}