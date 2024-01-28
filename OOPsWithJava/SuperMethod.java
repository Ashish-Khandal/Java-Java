package OOPsWithJava;
class ParentClass1{

    int num1 = 10;

    void showData() {
        System.out.println("\nInside the ParentClass showData method");
        System.out.println("ChildClass num = " + num1);
    }
}

class ChildClass1 extends ParentClass1{

    int num2 = 20;

    void showData() {
        System.out.println("\nInside the ChildClass showData method");
        System.out.println("ChildClass num = " + num2);

        super.showData();

    }
}

public class SuperMethod {

    public static void main(String[] args) {
        ChildClass1 obj = new ChildClass1();

        obj.showData();
        //super.showData();	// super can't be used here

    }
}
