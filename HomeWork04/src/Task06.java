import java.util.Scanner;

//Просортировать весь двумерный массив целиком.

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int k = 0;
        int r = 0;
        boolean flag = false;
        int[][] a = new int[row][col];
        int[] b = new int[row * col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 10 + (int) (Math.random() * 89);
                b[k] = a[i][j];
                k++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        do {
            flag = false;
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] > b[i + 1]) {
                    r = b[i + 1];
                    b[i + 1] = b[i];
                    b[i] = r;
                    flag = true;
                }
            }
        } while (flag);
        k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[k];
                k++;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
