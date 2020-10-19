import java.util.Scanner;

class MinJumps {
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
        int ladder = a[0];
        int steps = a[0];
        int jumps = 1;

        for (int i = 1; i < n - 1; i++) {
            if (i + a[i] > ladder) {
                ladder = a[i] + i;
            }

            steps--;
            if (steps == 0) {
                jumps++;
                steps = ladder - i;
            }
            if (steps < 0)
                return -1;
        }

        return jumps;
    }
}

// 1 4 3 2 6 7
// |