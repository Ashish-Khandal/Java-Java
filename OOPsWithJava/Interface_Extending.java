package OOPsWithJava;

interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class ExtendWithNewClass {
    void extendSample() {
        System.out.println("Extend Class Method.");
    }
}

class ImplementingClass2 extends ExtendWithNewClass implements ChildInterface {

    public void childMethod() {
        System.out.println("Child Interface method!!");
    }

    public void parentMethod() {
        System.out.println("Parent Interface mehtod!");
    }
}

public class Interface_Extending {

    public static void main(String[] args) {

        ImplementingClass2 obj = new ImplementingClass2();

        obj.childMethod();
        obj.parentMethod();
        obj.extendSample();

    }

}