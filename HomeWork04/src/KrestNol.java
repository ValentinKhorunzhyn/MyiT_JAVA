import java.util.Scanner;

public class KrestNol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] example = new String[4][4];
        System.out.println("Поле для игры в крестики нолики квадратное 3 на 3");
        example[0][1] = example[1][0] = "1";
        example[0][2] = example[2][0] = "2";
        example[0][3] = example[3][0] = "3";
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example[0].length; j++) {
                if (example[i][j] == null) {
                    example[i][j] = " ";
                }
            }
        }
        printField(example);
        System.out.println("Для того чтобы поставить Х или О необходимо поставить координаты элемента");
        for (int i = 0; i < 10; i++) {
            putSymbol(example,in);
            printField(example);
        }


    }

    static void putSymbol(String[][] arr, Scanner sc) {
        System.out.println("Введите координату символа по горизонтали");
        int row = sc.nextInt();
        System.out.println("Введите координату символа по вертикали");
        int col = sc.nextInt();
        arr[col][row] = "X";
    }

    static void printField(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------");
    }
}
