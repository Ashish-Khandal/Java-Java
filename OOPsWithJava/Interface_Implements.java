package OOPsWithJava;


interface Human {

    void learn(String str);

    void work();

  int duration = 10;

}

class Programmer implements Human {
    public void learn(String str) {
        System.out.println("Learn using " + str);
    }

    public void work() {
        System.out.println("Develop applications");
    }
}

public class Interface_Implements {

    public static void main(String[] args) {
        Programmer pr = new Programmer();
        pr.learn("coding");
        pr.work();
    }
}
