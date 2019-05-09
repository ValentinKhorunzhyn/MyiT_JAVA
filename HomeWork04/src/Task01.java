
//Создать двумерный массив размером 5 на 5. Заполнить последовательно числами от 0 до 24.


public class Task01 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = count;
                System.out.print(a[i][j] + " ");
                count++;
            }
            System.out.println("");
        }

    }
}
