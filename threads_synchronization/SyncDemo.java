/*WAP FOR THREAD SYNCHRONIZATION.*/

package javac.threads_synchronization;

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterUpdater t1 = new CounterUpdater(counter);
        CounterUpdater t2 = new CounterUpdater(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("FINAL COUNT => " + counter.getCounter());
    }
}

class Counter {
    private int counter;

    /*SOLUTION FOR DATA INCONSISTENCY TO CREATE METHOD SYNCHRONIZED*/
    /*public synchronized void getIncrementCounter() {
        counter++;
    }*/

    /*SOLUTION FOR DATA INCONSISTENCY TO CREATE SYNCHRONIZATION BLOCK*/
    /*public void getIncrementCounter() {
        synchronized (this) {
            counter++;
        }
    }*/

    /*PROBLEM*/
    public void getIncrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

class CounterUpdater extends Thread {

    private final Counter counter;

    CounterUpdater(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000; i++) {
            counter.getIncrementCounter();
        }
    }
}
