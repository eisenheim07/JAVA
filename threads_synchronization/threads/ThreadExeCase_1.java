package javac.threads_synchronization.threads;

/*
1.) SINGLE TASK FROM SINGLE THREAD.
2.) SINGLE TASK FROM MULTIPLE THREAD.
3.) MULTIPLE TASK FROM SINGLE THREAD.   // THIS CASE IS NOT POSSIBLE.
4.) MULTIPLE TASK FROM MULTIPLE THREAD.
*/

/*SINGLE TASK FROM SINGLE THREAD.*/
public class ThreadExeCase_1 implements Runnable {

    public static void main(String[] args) {
        new Thread(new ThreadExeCase_1()).start();
    }

    @Override
    public void run() {
        System.out.println("SINGLE TASK FROM SINGLE THREAD.");
    }
}

/*SINGLE TASK FROM MULTIPLE THREAD.*/
class ThreadExeCase_2 implements Runnable {

    public static void main(String[] args) {
        new Thread(new ThreadExeCase_2()).start();
        new Thread(new ThreadExeCase_2()).start();
        new Thread(new ThreadExeCase_2()).start();
    }

    @Override
    public void run() {
        System.out.println("SINGLE TASK FROM MULTIPLE THREAD. " + Thread.currentThread().getName());
    }
}

/*MULTIPLE TASK FROM MULTIPLE THREAD.*/
class ThreadExeCase_31 implements Runnable {

    @Override
    public void run() {
        System.out.println("MULTIPLE TASK FROM MULTIPLE THREAD. " + Thread.currentThread().getName());
    }
}

class ThreadExeCase_32 implements Runnable {

    @Override
    public void run() {
        System.out.println("MULTIPLE TASK FROM MULTIPLE THREAD. " + Thread.currentThread().getName());
    }
}

class ThreadExeCase_33 implements Runnable {

    @Override
    public void run() {
        System.out.println("MULTIPLE TASK FROM MULTIPLE THREAD. " + Thread.currentThread().getName());
    }
}

class ThreadExeCase_3Main {

    public static void main(String[] args) {
        new Thread(new ThreadExeCase_31()).start();
        new Thread(new ThreadExeCase_32()).start();
        new Thread(new ThreadExeCase_33()).start();
    }
}