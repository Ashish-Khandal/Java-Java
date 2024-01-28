package OOPsWithJava;

class Overriding {
    void over() {
        System.out.println("This is a first method for overriding class.");
    }

    void over2(int a) {
        System.out.println("Method over2 variable value is :- " + a);
    }
}

class Overriding2 extends Overriding {
    //! Overriding condition :-
    /*
    ? 1. Same Signature: Subclass method must have the same name, return type, and parameters as the superclass method.
    ? 2. Inheritance: Overriding occurs in a subclass inheriting from a superclass.
    ? 3. Access Modifier: Subclass method can't be more restrictive in access than the superclass method.
    ? 4. Exceptions: Subclass method can throw the same or narrower exception types than the superclass method.
    ? 5. Return Type: Subclass method's return type can be the same or a subtype of the superclass method's return type.
    ? 6. Method Body: Subclass provides a new implementation for the method, can't use final, static, or private.
    ? 7. @Override Annotation: Optional, but recommended, to indicate intentional overriding.
    */
    void over() {
        //? if methods are overriding then use super keyword and call the parents class same methods.
        super.over();
        System.out.println("This is a second method for overriding2 class.");
    }

    void over2(int a) {
        //? if methods are overriding then use super keyword and call the parents class same methods.
        super.over2(10);
        System.out.println("Method over2 variable value is :- " + a);
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Overriding2 ovr = new Overriding2();
        ovr.over();
        ovr.over2(20);
    }
}
