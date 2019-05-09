//Создать двумерный массив размером 5 на 5. Заполнить случайными числами от 0 до 9. Просортировать его одномерные массивы по отдельности.
//  Просортировать столбцы по отдельности.
//  Пользователь выбирает по строкам или по столбцам отсортировать массив.
//  Найти среднее арифметическое каждой строки массива и записать их в отдельный массив.


import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int rpl;
        int count = 0;
        int summ = 0;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 9);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Выберите способ сортировки элементов массива: 1 - по строкам,2 - по столбцам");
        Scanner sc = new Scanner(System.in);
        int sort = sc.nextInt();

        switch (sort) {
            case 1:
                for (int i = 0; i < a.length; i++) {
                    do {
                        flag = false;
                        for (int j = 0; j < a[0].length - 1; j++) {

                            if (a[i][j] > a[i][j + 1]) {
                                rpl = a[i][j + 1];
                                a[i][j + 1] = a[i][j];
                                a[i][j] = rpl;
                                flag = true;
                            }
                        }
                    } while (flag);

                }
                break;
            case 2:
                for (int j = 0; j < a[0].length; j++) {
                    do {
                        flag = false;

                        for (int i = 0; i < a.length - 1; i++) {
                            if (a[i][j] > a[i + 1][j]) {
                                rpl = a[i + 1][j];
                                a[i + 1][j] = a[i][j];
                                a[i][j] = rpl;
                                flag = true;
                            }
                        }
                    } while (flag);

                }
                break;
            default:
                System.out.println("Вы ввели неверное число");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Среднее арифметическое каждой строки массива: ");
        int[][] b = new int[5][1];
        for (int i = 0,m=0,k=0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                summ+=a[i][j];
                count+=1;
            }
            b[m][k]=(summ/count);
            m++;
            k=0;
            summ=0;
            count=0;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }


    }

}

