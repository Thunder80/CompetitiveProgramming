public class Kadenes {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.ni();

        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        long sum = 0;
        long maxSoFar = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum < 0)
                sum = 0;
            maxSoFar = Math.max(maxSoFar, sum);
        }

        fr.p(maxSoFar);
    }
}
