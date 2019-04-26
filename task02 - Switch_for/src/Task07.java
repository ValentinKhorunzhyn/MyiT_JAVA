import java.util.Scanner;

//7. Считать число (оно может быть любым). Вывести сумму и среднее арифметическое
// его цифр.

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int summ = 0;
        int count = 0;
        int digit;
        for (int i = 1; n != 0; i++) {
            digit = n % 10;
            n = n - digit;
            n = n / 10;
            summ += digit;
            count++;

        }
        System.out.println(summ);
        System.out.println("Среднее арифметическое " + summ/count);
    }
}
