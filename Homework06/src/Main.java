public class Main {

    public static void main(String[] args) {
//        printMedium(arrayCup(15));
//        System.out.println(findObjects(arrayCup(500)));
        findMainObject(arrayCup(500));
    }

    static Cup[] arrayCup(int numb) {
        Cup[] cup = new Cup[numb];
        for (int i = 0; i < cup.length; i++) {
            int r = (int) (Math.random() * 10);
            if (r < 5) {
                cup[i] = new Cup(((int) (Math.random() * 10)) * 50);
            } else {
                cup[i] = new Thermos(((int) (Math.random() * 10)) * 50, ((int) (Math.random() * 100)));
            }

        }
        return cup;
    }

    static int findObjects(Cup[] c) {
        int count = 0;
        int r = (int) (Math.random() * c.length);
        int h = c[r].hashCode();
        System.out.println(c[r]);
        for (int i = 0; i < c.length; i++) {
            if (c[i].hashCode() == h && c[i].equals(c[r])) {
                System.out.println(c[i]);
                count += 1;
            }
        }

        return count - 1;
    }

    static void findMainObject(Cup[] c) {
        int count = 0;
        int count2 = 0;
        int id = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i].equals(c[j]) && c[i].hashCode()==c[j].hashCode()) {
                    count += 1;
                }
            }
            if (count > count2) {
                count2 = count;
                id = i;
            }
            count=0;

        }
        System.out.println("Элемент " + c[id] + " повторяется " + count2 + " раз");
    }
}

//    static void printMedium(Cup[] c) {
//        int summVolume = 0;
//        int summTemp = 0;
//        int count = 0;
//        for (int i = 0; i < c.length; i++) {
//            summVolume += c[i].max_capasity;
//            if (c[i] instanceof Thermos) {
//                Thermos t = (Thermos) c[i];
//                count+=1;
//                summTemp += t.k;
//            }
//
//        }
//        System.out.println("Средняя температура =  " + summTemp/count );
//        System.out.println("Полный объем сосудов = " + summVolume + " мл");
//
//    }

