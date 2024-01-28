package OOPsWithJava;

interface Human2 {
    void learn(String str);

    void work();
}

interface Recruitment {
    boolean screening(int score);

    boolean interview(boolean selected);
}

class Programmer2 implements Human, Recruitment {
    public void learn(String str) {
        System.out.println("Learn using " + str);
    }

    public boolean screening(int score) {
        System.out.println("Attend screening test");
        int thresold = 20;
        if (score > thresold)
            return true;
        return false;
    }

    public boolean interview(boolean selected) {
        System.out.println("Attend interview");
        if (selected)
            return true;
        return false;
    }

    public void work() {
        System.out.println("Develop applications");
    }
}

public class Interface_Multiple {
    public static void main(String[] args) {
        Programmer2 trainee = new Programmer2();
        trainee.learn("Coding");
        trainee.screening(30);
        trainee.interview(true);
        trainee.work();
    }
}