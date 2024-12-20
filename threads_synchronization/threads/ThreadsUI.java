package practice.threads_synchronization.threads;

public class ThreadsUI {

    public static void main(String[] args) {

        System.out.println("HELLO WORLD 1");

        /*PROBLEM*/
        /*try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        /*PROBLEM*/

        /*SOLUTION*/
        Runnable r = () -> {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
        Thread th = new Thread(r);
        th.start();
        /*SOLUTION*/

        System.out.println("HELLO WORLD 2");
    }
}
