package OOPsWithJava;

class Overloading {
    void over() {
        System.out.println("This a first method for class overloading.");
    }

    void over(int a, int b) {
        System.out.println("This a Second method for class overloading.");
        System.out.println("This methods variable values a,b are :- " + a + "," + b);
    }

    void over(int a, int b, int c) {
        System.out.println("This a third method for class overloading.");
        System.out.println("This methods variable values a,b and c are :- " + a + "," + b + "," + c);
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Overloading ov = new Overloading();
        ov.over();
        ov.over(5, 6);
        ov.over(1,2,3);
    }
}
