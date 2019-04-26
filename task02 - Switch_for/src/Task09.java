import java.util.Scanner;

/*9. Считать 2 числа a и b, вывести прямоугольник * со сторонами a и b.
        Пример: 2 3
        ***
        ***
        4 7
        *******
        *******
        *******
        ********/

public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
