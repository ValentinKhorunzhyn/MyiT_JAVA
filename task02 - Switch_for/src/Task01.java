import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Для определения первоначального направления и угла поворота введите данные!");
        System.out.println("Когда Вам надоест вводить путь, нажмите 5");
        Scanner in = new Scanner(System.in);
        int way = in.nextInt();
        int step = 0;
        for (int i = 1; i > 0; i++) {
            int corner = in.nextInt();
            if (corner == 0) {
                step = step + 1;
            }
            int fullway = way + corner;
            if (corner ==5){
                fullway = 5;
            }
            switch (fullway) {
                case 5: {
                    System.out.println("Программа завершена по желанию пользователя");
                    break;
                }
                case 10: {
                    System.out.println("Запад");
                    break;
                }
                case 11: {
                    System.out.println("Север");
                    break;
                }
                case 12: {
                    System.out.println("Восток");
                    break;
                }
                case 13: {
                    System.out.println("Юг");
                    break;
                }
                case 14: {
                    System.out.println("Запад");
                    break;
                }
                case 15: {
                    System.out.println("Север");
                    break;
                }
                default: {
                    System.out.println("Вы вышли за пределы промежутка");
                }
            }
            way = fullway;
            System.out.println("Пройденный путь " + step + " м.");
        }


    }
}
