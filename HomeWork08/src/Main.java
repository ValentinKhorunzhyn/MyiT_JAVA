public class Main {
    public static void main(String[] args) throws InterruptedException {
        CreditCard cc = new CreditCard();
        Work job = new Work(cc);
        Work job2 = new Work(cc);
        job.start();
        job2.start();
        job.join();
        job2.join();
        System.out.println(cc.getBalance());

    }
}

class CreditCard {

    private int balance;

    void changeBalance(int n) {
        synchronized (this) {
            balance += n;
        }
    }

    public int getBalance() {
        return balance;
    }

}

class Work extends Thread {

    CreditCard resourse;

    public Work(CreditCard resourse) {
        this.resourse = resourse;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            resourse.changeBalance(1);
        }
    }
}
