package Thread;
class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
            System.out.println("111111 MyThread1 is Running... 111111");
            System.out.println("*****");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
            System.out.println("222222 MyThread2 is Running... 222222");
            System.out.println("|||||");
            i++;
        }
    }
}
public class ThreadExtend {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        mt1.start();
        mt2.start();
    }
}
