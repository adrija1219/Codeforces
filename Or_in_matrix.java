//486B
//Or in a matrix
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] B = new int[m][n];
        int[][] A = new int[m][n];
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for (int i = 0; i < m; i++) Arrays.fill(A[i], 1);

        // Read matrix B and mark zero rows/cols
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
                if (B[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Apply zeroes to matrix A
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    A[i][j] = 0;
                }
            }
        }

        // Verify if matrix A generates matrix B correctly
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int OR = 0;
                for (int k = 0; k < n; k++) OR |= A[i][k];
                for (int k = 0; k < m; k++) OR |= A[k][j];

                if (OR != B[i][j]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        // Print result
        System.out.println("YES");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
