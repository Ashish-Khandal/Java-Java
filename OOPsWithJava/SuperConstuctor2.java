package OOPsWithJava;

class ParentClass2 {

    int num1;

    ParentClass2() {
        System.out.println("\nInside the ParentClass default constructor");
        num1 = 10;
    }

    ParentClass2(int value) {
        System.out.println("\nInside the ParentClass parameterized constructor:- " + value);
        num1 = value;
    }
}

class ChildClass2 extends ParentClass2 {

    int num2;

    ChildClass2() {
        super(100);
        System.out.println("\nInside the ChildClass constructor");
        num2 = 200;
    }
}

public class SuperConstuctor2 {

    public static void main(String[] args) {

        ChildClass2 obj = new ChildClass2();

    }
}
