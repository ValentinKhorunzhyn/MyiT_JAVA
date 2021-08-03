import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) {
        List<Count> count = new ArrayList();
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            Count co = new Count();
            co.start();
            count.add(co);
        }
        do {
// flag = false;
            for (int i = 0; i < count.size();i++ ) {
                if (((int) (Math.random() * 10)) < 5 & count.get(i).isAlive() == true) {
                    count.get(i).interrupt();
                    System.out.println(count.get(i).getName() + " is STOPPED");
                    count.remove(i--);
// flag = true;
                }
// else {
// i++;
// }
            }
        } while (count.size()!=0);

    }

}

class Count extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            if (Thread.interrupted()) {

                System.out.println(Thread.currentThread().getName()+" Interrupted");
                break;
            }

            System.out.println(Thread.currentThread().getName() + " count " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {

                System.out.println("Болт Вам а не остановка");
                break;
            }

        }

    }
}
