import java.util.Scanner;


//4. Считать число. Вывести все предшествующие натуральные числа.

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = number-1; i > 0; i--) {
            System.out.println(i);
        }
    }
}
