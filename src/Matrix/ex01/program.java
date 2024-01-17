package Matrix.ex01;
import java.util.Scanner;
public class program {
    public program() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("--------------");
        int[][] mat = new int[m][n];

        int x;
        int i;
        for(x = 0; x < mat.length; ++x) {
            for(i = 0; i < mat[x].length; ++i) {
                mat[x][i] = sc.nextInt();
            }
        }

        System.out.println("--------------");
        x = sc.nextInt();

        for(i = 0; i < mat.length; ++i) {
            for(int j = 0; j < mat[i].length; ++j) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j > 0) {
                        int left = mat[i][j - 1];
                        System.out.println("Left: " + left);
                    }

                    if (i > 0) {
                        int up = mat[i - 1][j];
                        System.out.println("Up: " + up);
                    }

                    if (j < mat[i].length - 1) {
                        int right = mat[i][j + 1];
                        System.out.println("Right: " + right);
                    }
                    if (i < mat.length - 1) {
                        int down = mat[i + 1][j];
                        System.out.println("Down: " + down);
                    }

                }
            }
        }

        sc.close();
    }
}
