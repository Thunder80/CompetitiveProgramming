import java.util.Scanner;

class template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = solve(n, a);
        System.out.println(ans);
        sc.close();
    }

    public static int solve(int n, int a[]) {
        return 0;
    }
}

// 1 4 3 2 6 7
// |