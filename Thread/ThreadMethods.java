package Thread;

class Mythre extends Thread {
    Mythre(String name) {
        super(name);
        System.out.println("This is a Thread method name: - " + name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 1) {
            System.out.println("%%%%");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Mythre mtr1 = new Mythre("Surya");
        Mythre mtr2 = new Mythre("Ashish");
        System.out.println(mtr1.getName());
        System.out.println(mtr1.getId());
        mtr1.start();
        System.out.println(mtr2.getName());
        System.out.println(mtr2.getId());
        mtr2.start();
    }
}
