package OOPsWithJava;

interface DefaultMethodCheck {
    void withoutDefault();

    private void privateMethod() {
        System.out.println("Private Method.");
    }

    //! If you are not implement a method in any class then use default modifier.
    default void defaultMethod() {
        //! If we are call the private method.
        privateMethod();
        System.out.println("Default Method.");
    }
}

class DefaultMethodImplement implements DefaultMethodCheck {
    @Override
    public void withoutDefault() {
        System.out.println("Simple Method.");
    }

    //! This type method overriding is changing data of default method from interface.
/**    @Override
    public void defaultMethod() {
//        DefaultMethodCheck.super.defaultMethod();
        System.out.println("Overriding data for default method.");
    }*/
}

public class Interface_DefaultMethod {
    public static void main(String[] args) {
        DefaultMethodImplement dmi = new DefaultMethodImplement();
        dmi.withoutDefault();
        dmi.defaultMethod();
    }
}
