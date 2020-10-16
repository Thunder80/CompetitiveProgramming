import java.util.Scanner;

public class FastReader {
    private Scanner sc;

    FastReader() {
        sc = new Scanner(System.in);
    }

    public int ni() {
        int n = sc.nextInt();
        return n;
    }

    public long nl() {
        long n = sc.nextLong();
        return n;
    }

    public double nd() {
        double n = sc.nextDouble();
        return n;
    }

    public String ns() {
        String s = sc.next();
        return s;
    }

    public void p(long l) {
        System.out.print(l);
    }

    public void p(double d) {
        System.out.print(d);
    }

    public void p(String s) {
        System.out.print(s);
    }

    public void pl() {
        System.out.println();
    }

    public void pra(long a[]) {
        for (int i = 0; i < a.length; i++) {
            p(a[i] + " ");
        }
        pl();
    }

    public void pra(double a[]) {
        for (int i = 0; i < a.length; i++) {
            p(a[i] + " ");
        }
        pl();
    }

    public void pra(String a[]) {
        for (int i = 0; i < a.length; i++) {
            p(a[i] + " ");
        }
        pl();
    }

    public void prdda(long a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                p(a[i][j] + " ");
            pl();
        }
    }

    public void prdda(double a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                p(a[i][j] + " ");
            pl();
        }
    }

    public void prdda(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                p(a[i][j] + " ");
            pl();
        }
    }
}
