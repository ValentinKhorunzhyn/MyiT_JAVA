public class SortInsert {
    public static void main(String[] args) {
        int[] arr = new int[30];
        init(arr);
        sorting(arr);
        print(arr);

    }

    public static void init(int[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i] = 10 + (int) (Math.random() * 89);
            System.out.print(c[i] + " ");
        }
        System.out.println();


    }

    public static void print(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();


    }

    public static void sorting(int[] c) {
        int buf = 0;
        int ind = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] > c[i + 1]) {
                ind = i + 1;
                buf = c[i + 1];
                for (int j = i; j >= 0; j--) {
                    if (c[j] < buf) {
                        for (int k = j + 1; k < ind; k++) {
                            c[k+1]=c[k];
                        }
                        c[j+1]=buf;
                    }
                }

            }
        }
    }

}