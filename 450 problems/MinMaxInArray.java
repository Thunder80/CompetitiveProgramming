public class MinMaxInArray {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        fr.p("Enter n");
        fr.pl();
        int n = fr.ni();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        fr.p("Input: ");
        fr.pra(a);

        long ans[] = maxMin(a, 0, n - 1);
        fr.p(ans[0] + " " + ans[1]);
    }

    static long[] maxMin(long a[], int low, int high) {
        // 0 - max, 1 - min
        long ans[] = new long[2];
        if (low == high) {
            ans[0] = a[low];
            ans[1] = a[high];
            return ans;
        } else if (low + 1 == high) {
            if (a[low] > a[high]) {
                ans[0] = a[low];
                ans[1] = a[high];
            } else {
                ans[0] = a[high];
                ans[1] = a[low];
            }
            return ans;
        } else {
            int mid = low + (high - low) / 2;
            long res1[] = maxMin(a, low, mid);
            long res2[] = maxMin(a, mid + 1, high);
            ans[0] = Math.max(res1[0], res2[0]);
            ans[1] = Math.min(res1[1], res2[1]);
            return ans;
        }
    }
}
