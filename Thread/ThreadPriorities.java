package Thread;
class MyThreadPriorities extends Thread {
    public MyThreadPriorities(String name){
        super(name);
        System.out.println(name);
    }
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(this.getName());
            i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThreadPriorities msp = new MyThreadPriorities("Surya");
        MyThreadPriorities msp1 = new MyThreadPriorities("Pandit");
        MyThreadPriorities msp2 = new MyThreadPriorities("Ashish"+ " IMPORTANT");
        MyThreadPriorities msp3 = new MyThreadPriorities("Sharma");
        MyThreadPriorities msp4 = new MyThreadPriorities("Khandal");
        msp.start();
        msp1.start();
        msp2.start();
        msp3.start();
        msp4.start();
        msp2.setPriority(Thread.MAX_PRIORITY);
        msp.setPriority(Thread.MIN_PRIORITY);
        msp1.setPriority(Thread.MIN_PRIORITY);
        msp3.setPriority(Thread.MIN_PRIORITY);
        msp4.setPriority(Thread.MIN_PRIORITY);
    }
}
