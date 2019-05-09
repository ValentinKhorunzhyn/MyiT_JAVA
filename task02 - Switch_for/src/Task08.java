import java.util.Scanner;


//8. Считать число (оно может быть любым). Получить сумму его цифр, затем сумму цифр суммы
// и т д пока не получится однозначное число.


public class Task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int lastSumm = 100;
        int summ = 0;
        int digit;

        for (int j = 1; lastSumm > 9; j++) {
            for (int i = 1; n != 0; i++) {
                digit = n % 10;
                n -= digit;
                n /= 10;
                summ += digit;
                lastSumm = summ;
            }
            if (summ > 9) {
                n = summ;
            }
        }


        System.out.println(summ);
    }


}

