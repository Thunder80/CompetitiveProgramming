public class RotateByOne {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.ni();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        long temp = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        fr.pra(a);
    }
}
