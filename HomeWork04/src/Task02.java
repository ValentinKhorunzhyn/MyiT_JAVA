//Создать двумерный массив размером 5 на 5. Заполнить последовательно числами от 0 до 24.
//  Проверить есть ли в массиве значение, введенное с клавиатуры.
//Вывести количество таких значений в массиве и все индексы этих элементов.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[5][5];
        int c = 0;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = c;
                System.out.print(a[i][j] + " ");
                c++;
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == n) {
                    System.out.println("В массиве есть элемент со значением: " + a[i][j]);
                    System.out.println("Индекс этого элемента: " + "[" + i + "]" + "[" + j + "]");
                    count+=1;
                    flag = true;
                }
            }
        }
        if (count>0){
            System.out.println("Количество совпавших элементов равно: " + count);
        }
        if (!flag) {
            System.out.println("Нет такого элемента в массиве");
        }
    }
}

