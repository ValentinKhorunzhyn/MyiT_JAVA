
//Просортировать строки двумерного массива по первому элементу в каждом. (переставляются местами
// не конечные элементы-переменные, а целые одномерные массивы)
//Просортировать столбцы двумерного массива по первому элементу в каждом.

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        boolean flag = false;
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 9);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //сортировка по строкам
        /*do {
            flag = false;
            for (int i = 0, j = 0; i < a.length - 1; i++) {
                if (a[i][j] > a[i + 1][j]) {
                    b[i] = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = b[i];
                    flag = true;
                }
            }
        } while (flag);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/
        // сортировка по столбцам
        do {
            flag = false;
            for (int j = 0, i = 0; j < a[0].length - 1; j++) {
                if (a[i][j] > a[i][j + 1]) {
                    for (int k = i; k < a.length - 1; k++) {
                        b[k][j + 1] = a[i][j + 1];
                        a[i][j + 1] = a[i][j];
                        a[i][j] = b[k][j + 1];
                        flag = true;
                    }
                }
            }
        }while (flag);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
