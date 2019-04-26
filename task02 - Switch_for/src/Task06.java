import java.util.Scanner;

//6. Считать 2 числа a и b, вывести случайное число в диапазоне [a; b].

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b) {
            System.out.println(a + (int) (Math.random() * b));
        } else {
            System.out.println(b + (int) (Math.random() * a));
        }
    }
}
