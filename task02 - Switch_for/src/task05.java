import java.util.Scanner;

//5. Считать два числа a и b. Вывести все натуральные числа межу a и b.

public class task05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.println(i);
            }
        }


    }

}
