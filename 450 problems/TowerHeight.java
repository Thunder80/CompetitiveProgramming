import java.util.Arrays;

public class TowerHeight {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int k = fr.ni();
        int n = fr.ni();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nl();
        }

        Arrays.sort(a);
        long small = a[0], big = a[n-1];
        long ans = a[n-1] - a[0];
        for(int i = 0;i < n;i++){
            if(a[i] + k > small) small = a[i];;

            if(a[i] - k > big) big = a[i];
        }

        ans = Math.min(ans, big-small);
        fr.p(ans);
    }
}
