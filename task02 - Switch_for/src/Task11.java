import java.util.Scanner;

//считать числа из командной строки и вывести два самых больших числа
public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bigNumb = 0;
        int lowNumb = 0;
        int n;
        do {
            n = in.nextInt();
            if (n > bigNumb) {

                bigNumb = n;

            }
            if (n > lowNumb && n < bigNumb) {
                lowNumb = n;
            }

        } while (!(n == 0));
        System.out.println("Два самых больших по величине числа: " + bigNumb + " и " + lowNumb);
    }

}
