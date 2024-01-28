package Thread;

class MyRunnableThread1 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("@@@@@");
            i++;
        }
    }
}

class MyRunnableThread2 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("?????");
            i++;
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyRunnableThread1 mrt1 = new MyRunnableThread1();
        Thread th1 = new Thread(mrt1);
        MyRunnableThread2 mrt2 = new MyRunnableThread2();
        Thread th2 = new Thread(mrt2);
        th1.start();
        th2.start();
    }
}
