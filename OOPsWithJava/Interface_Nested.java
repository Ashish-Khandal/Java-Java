package OOPsWithJava;

interface OuterInterface {
    void outerMethod();

    interface InnerInterface {
        void innerMethod();
    }
}

class OuterClass {
    interface InnerClassInterface {
        void innerClassMethod();
    }
}

class OnlyInner implements OuterInterface.InnerInterface {
    public void innerMethod() {
        System.out.println("This is InnerInterface method.");
    }
}

class OnlyOuter implements OuterInterface {
    public void outerMethod() {
        System.out.println("This is OuterInterface method.");
    }
}

class ImplementingClass implements OuterClass.InnerClassInterface {
    public void innerClassMethod() {
        System.out.println("This is an InnerClassInterfaceMethod.");
    }
}


public class Interface_Nested {

    public static void main(String[] args) {
        OnlyOuter obj_1 = new OnlyOuter();
        OnlyInner obj_2 = new OnlyInner();
        ImplementingClass obj_3 = new ImplementingClass();
        obj_1.outerMethod();
        obj_2.innerMethod();
        obj_3.innerClassMethod();

    }

}