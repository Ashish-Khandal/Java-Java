package Thread;

class JoinThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("This is a Join Thread.");
            i++;
        }
    }
}

class JoinThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is a Sleep Thread.");
            i++;
        }
    }
}

    public class Thread_Join_Sleep {
        public static void main(String[] args) {
            JoinThread1 j1 = new JoinThread1();
            JoinThread2 j2 = new JoinThread2();
            j1.start();
            try {
                j1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            j2.start();
        }
    }
