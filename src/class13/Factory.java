import java.util.ArrayList;
import java.util.List;

public class Factory {
    private final int LIMIT = 5;
    private final int BOTTOM = 0;
    private List<Integer> products = new ArrayList<>();
    private int value = 0;
    private final Object lock = new Object();

    //ReentrantLock
    //BlockingQueue

    // lock.wait()
    // lock.notify()

    public void produce() throws InterruptedException {
        synchronized (lock) {
            while(true) {
                if(products.size() == LIMIT) {
                    System.out.println("Waiting for selling");
                    lock.wait();
                } else {
                    System.out.println("Producing product" + value);
                    products.add(value ++);
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void sell() throws InterruptedException {
        synchronized (lock) {
            while(true) {
                if(products.size() == BOTTOM) {
                    System.out.println("Waiting for producing");
                    lock.wait();
                } else {
                    products.remove(-- value);
                    System.out.println("Selling product" + value);
                    lock.notify();
                }

                Thread.sleep(500);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Thread t1 = new Thread(() -> {
            try {
                factory.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                factory.sell();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

    }
}