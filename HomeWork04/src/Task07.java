//Найти наибольшее значение из строки с минимальным средним арифметическим.
//Найти наименьшее значение из строки с максимальным средним арифметическим.
// тоже самое по столбцам
//А теперь пользователь решает по строкам или по столбцам, наибольший из минимальных или наименьший из максимальных.

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество одномерных массивов: ");
        int row = in.nextInt();
        System.out.println("Введите количество элементов в одномерном массиве: ");
        int col = in.nextInt();
        int summ = 0, summ1 = 0, count1 = 0, count = 0, q = 0, k = 0, z = 0, m = 0, key = 0;
        int bNumb = 0, bcNumb = 0;
        int lNumb = 0, lcNumb = 0;
        boolean flag = false;
        int[][] a = new int[row][col];
        int[][] b = new int[row][2];
        int[][] c = new int[row][2];
        int[] d = new int[col];
        int[] g = new int[row];
        int[][] h = new int[2][col];
        int[][] v = new int[2][col];
        int[][] f = new int[2][col];
        //Заполнение массива с выводом среднего арифметического по строкам и вывод номера строки
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 10 + (int) (Math.random() * 89);
                summ += a[i][j];
                count += 1;
                System.out.print(a[i][j] + " ");
            }
            b[k][z] = summ / count;
            b[k][z + 1] = key;
            k++;
            key++;
            z = 0;
            summ = 0;
            count = 0;
            System.out.print("  " + b[k - 1][z] + " - " + b[k - 1][z + 1]);
            System.out.println();
        }
        System.out.println();
        //среднее арифметическое по столбцам с номером столбца
        for (int i = 0, l = 0; i < f[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                summ1 += a[j][i];
                count1 += 1;
            }
            f[l][i] = summ1 / count1;
            f[l + 1][i] = q;
            q++;
            count1 = 0;
            summ1 = 0;
            System.out.print(f[l][i] + " ");
        }
        System.out.println();
        for (int i = 0, j = 1; i < f[0].length; i++) {
            System.out.print(f[j][i] + "  ");
        }
        System.out.println();
        System.out.println();
        //копирование среднего арифметического и номера столбца в другой массив для сортировки:
        for (int i = 0, j = 0; i < f[0].length; i++) {
            h[j][i] = f[j][i];
            h[j + 1][i] = f[j + 1][i];
        }
        //сортировка в новом массиве по столбцам для выявления мин и макс среднего арифметического
        // для этого придется создать массив где будем хранить временные значения(v)
        do {
            flag = false;
            for (int i = 0, j = 0; i < h[0].length - 1; i++) {
                if (h[j][i] > h[j][i + 1]) {
                    v[j][i + 1] = h[j][i + 1];
                    v[j + 1][i + 1] = h[j + 1][i + 1];
                    h[j][i + 1] = h[j][i];
                    h[j + 1][i + 1] = h[j + 1][i];
                    h[j][i] = v[j][i + 1];
                    h[j + 1][i] = v[j + 1][i + 1];
                    flag = true;
                }
            }
        } while (flag);
        //после сортировки адрес столбцов с  макс и мин средним  арифметическим хранится в элементах h[1][0] and h[1][col-1]
        //поиск максимального значения из столбца с минимальным средним арифметическим - столбец h[1][0]
        for (int i = 0; i < a.length; i++) {
            if (a[i][h[1][0]] > bcNumb) {
                bcNumb = a[i][h[1][0]];
            }
        }
        //поиск минимального значения из столбца с максимальным средним арифметическим - h[1][col-1]
        //для этого необходимо скопировать столбец в одномерный масив и просортировать
        // его и начальным элемент будет наш ключ
        for (int i = 0; i < g.length; i++) {
            g[i] = a[i][h[1][col - 1]];
        }
        //сортировка массива g на поиск минимального значения:
        do {
            flag = false;
            for (int i = 0; i < g.length - 1; i++) {
                if (g[i] > g[i + 1]) {
                    m = g[i + 1];
                    g[i + 1] = g[i];
                    g[i] = m;
                    flag = true;
                }
            }
            lcNumb = g[0];
        } while (flag);
        //сортировка
        do {
            flag = false;
            for (int i = 0, j = 0; i < b.length - 1; i++) {
                if (b[i][j] > b[i + 1][j]) {
                    c[i + 1][j] = b[i + 1][j];
                    c[i + 1][j + 1] = b[i + 1][j + 1];
                    b[i + 1][j] = b[i][j];
                    b[i + 1][j + 1] = b[i][j + 1];
                    b[i][j] = c[i + 1][j];
                    b[i][j + 1] = c[i + 1][j + 1];
                    flag = true;
                }
            }
        } while (flag);

        for (int i = 0; i < a[0].length - 1; i++) {
            if (a[b[0][1]][i] > bNumb) {
                bNumb = a[b[0][1]][i];
            }
        }
        //поиск минимального значения по строке
        for (int i = 0; i < a[b[row - 1][1]].length; i++) {
            d[i] = a[b[row - 1][1]][i];
        }
        //сортировка
        do {
            flag = false;
            for (int i = 0; i < d.length - 1; i++) {
                if (d[i] > d[i + 1]) {
                    m = d[i + 1];
                    d[i + 1] = d[i];
                    d[i] = m;
                    flag = true;
                }
            }
            lNumb = d[0];
        } while (flag);
        System.out.println("Максимальноре значение " + bcNumb + " из " + h[1][0] + " столбца с минимальным средним арифметическим: " + h[0][0]);
        System.out.println("Минимальное значение " + lcNumb + " из " + h[1][col - 1] + " столбца с максимальным средним арифметическим: " + h[0][col - 1]);
        System.out.println("Максимальноре значение " + bNumb + " из " + b[0][1] + " строки с минимальным средним арифметическим: " + b[0][0]);
        System.out.println("Меньшее значение " + lNumb + " из " + b[row - 1][1] + " строки с максимальным средним арифметическим: " + b[row - 1][0]);
    }
}
