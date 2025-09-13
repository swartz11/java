import java.util.*;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        
        int row = 0, col = 0;
        boolean up = true; // direction flag
        
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            
            if (up) { // moving up-right
                if (col == n - 1) {  // hit right boundary
                    row++;
                    up = false;
                } else if (row == 0) { // hit top boundary
                    col++;
                    up = false;
                } else { // normal move
                    row--;
                    col++;
                }
            } else { // moving down-left
                if (row == m - 1) { // hit bottom boundary
                    col++;
                    up = true;
                } else if (col == 0) { // hit left boundary
                    row++;
                    up = true;
                } else { // normal move
                    row++;
                    col--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] result = findDiagonalOrder(mat);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        sc.close();
    }
}
