public class UnionSortedArray {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.ni();
        int m = fr.ni();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        long b[] = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = fr.nl();
        }

        // union
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                fr.p(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                fr.p(a[i] + " ");
                i++;
            } else {
                fr.p(b[j] + " ");
                j++;
            }
        }

        for (; i < n; i++) {
            fr.p(a[i] + " ");
        }
        for (; j < m; j++) {
            fr.p(b[j] + " ");
        }

        // intersection
        i = 0;
        j = 0;
        fr.pl();
        fr.pl();
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                fr.p(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
