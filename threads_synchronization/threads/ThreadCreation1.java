/*WAP TO CREATE SIMPLE THREAD.*/

package practice.threads_synchronization.threads;

public class ThreadCreation1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("THREAD CREATED THROUGH EXTENDS THREAD CLASS");
    }

    public static void main(String[] args) {
        new ThreadCreation1().start();
    }

}

class ThreadCreation2 implements Runnable {

    @Override
    public void run() {
        System.out.println("THREAD CREATED THROUGH RUNNABLE INTERFACE.");
    }

    public static void main(String[] args) {
        ThreadCreation2 obj = new ThreadCreation2();
        new Thread(obj).start();
    }
}
