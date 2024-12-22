package javac.threads_synchronization.threads;

public class ThreadsJoin extends Thread {

    @Override
    public void run() {
        super.run();
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println("NAME => " + name);
        }
    }

    public static void main(String[] args) {
        ThreadsJoin th1 = new ThreadsJoin();
        ThreadsJoin th2 = new ThreadsJoin();
        ThreadsJoin th3 = new ThreadsJoin();

        th3.start();
        try {
            th3.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        th1.start();
        try {
            th1.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        th2.start();
        try {
            th2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
