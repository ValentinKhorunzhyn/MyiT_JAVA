import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        List<Second> threads = new ArrayList();
        List<Second> deadT = new ArrayList();
        boolean flag = false;

        for (int i = 0; i < 5; i++) {
            Second second = new Second();
            threads.add(second);
            second.start();
            System.out.println(second.getName());
        }
        System.out.println("_________");


        do {

            for (int i = 0; i < threads.size(); i++) {
                if (threads.get(i).isAlive() == false) {
                    deadT.add(threads.get(i));
                    threads.remove(i);

                }
            }
        } while (threads.size()!=0);

        for (int i = 0; i < deadT.size(); i++) {
            System.out.println(deadT.get(i).getName());
            System.out.println(deadT.get(i).result);

        }

    }
}

class Second extends Thread {

    int result;

    public void run() {
        int a = (int) (Math.random() * 100);
        int x = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }
        int rez = a * x;
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }
        rez += b;
        result = rez;
    }
}
