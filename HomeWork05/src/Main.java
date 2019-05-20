import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int numb;
        pushCarYear(arr);
        printMessage("C 1980 по 1999 в Баварии производились BMW в 4 разных цветах!");
        printMessage("В нашем гараже хранится около 20 экземляров того времени!");

        OldAuto auto = new OldAuto();
        Scanner in = new Scanner(System.in);
        printMessage("Введите номер гаража: ");

        do {
            numb = in.nextInt();
            if (numb < 0 & numb > 19) {
                System.out.println("Вы ввели неправильный номер гаража");
                numb = 0;
            }
            System.out.println("Машина " + arr[numb] + " года выпуска: " + auto.getSeries(arr[numb]) +
                    " серия " + auto.getColor(arr[numb]) + " цвет");

        } while (!(numb == 0));
    }

    static void pushCarYear(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1980 + i;
        }
    }

    static void printMessage(String message) {
        System.out.println(message);
    }
}

class OldAuto {
    String series;
    String color;
    int year;

    String getSeries(int y) {
        if (1979 < y & y < 1985) {
            series = "Первая";
        } else if (1985 <= y & y < 1990) {
            series = "Вторая";
        } else if (1990 <= y & y < 1995) {
            series = "Третья";
        } else series = "Четвертая";
        return series;
    }

    String getColor(int y) {
        if (1979 < y & y < 1985) {
            color = "Красный";
        } else if (1985 <= y & y < 1990) {
            color = "Зеленый";
        } else if (1990 <= y & y < 1995) {
            color = "Желтый";
        } else color = "Серый";
        return color;
    }
}

