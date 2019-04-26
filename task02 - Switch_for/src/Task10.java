import java.util.Scanner;

/*10. Считать число х и вывести пирамидку * высоты х.
        Пример: 3
        *
        **
        ****/

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = i; j != 0; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
