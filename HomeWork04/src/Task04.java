//Разбить двумерный массив nxn (квдратный) на четыре равных двумерных массива размера mxm.

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Чтобы адекватно разбить массив на 4 одинаковых подмассива n должно быть красно 4.
        int[][]a = new int[n][n];
        int[][]b1 = new int[n/2][n/2];
        int[][]b2 = new int[n/2][n/2];
        int[][]b3 = new int[n/2][n/2];
        int[][]b4 = new int[n/2][n/2];
        for (int i = 0; i < a.length;i++){
            for (int j = 0;j<a[0].length;j++){
                a[i][j] = (int)(Math.random()*8);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //заполняем первый массив b1
        for (int i = 0,m=0;i<a.length/2;i++,m++){
            for (int j = 0,k=0;j<a[0].length/2;j++){
               b1[m][k]=a[i][j];
                System.out.print(b1[m][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Заполняем второй массив b2
        for (int i = 0,m=0;i<a.length/2;i++,m++){
            for (int j = a[0].length/2,k=0;j<a[0].length;j++){
                b2[m][k]=a[i][j];
                System.out.print(b2[m][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Заполняем третий массив b3
        for (int i = a.length/2,m=0;i<a.length;i++,m++){
            for (int j = 0,k=0;j<a[0].length/2;j++){
                b3[m][k]=a[i][j];
                System.out.print(b3[m][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Заполняем четвертый массив b4
        for (int i = a.length/2,m=0;i<a.length;i++,m++){
            for (int j = a[0].length/2,k=0;j<a[0].length;j++){
                b4[m][k]=a[i][j];
                System.out.print(b4[m][k] + " ");
            }
            System.out.println();
        }
    }
}
