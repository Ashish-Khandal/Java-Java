package OOPsWithJava;

/*
! Interfaces important points:-

? An interface is a container of abstract methods and static final variables.
? An interface, implemented by a class. (class implements interface).
? An interface may extend another interface. (Interface extends Interface).
? An interface never implements another interface, or class.
? A class may implement any number of interfaces.
? We can not instantiate an interface.
? Specifying the keyword abstract for interface methods is optional, it automatically added.
? All the members of an interface are public by default.

*/
public interface Interface_Structure {
    //?  All the members of an interface are public by default.
    abstract void learn(String str);

    public abstract void work();

    public static final int duration = 10;

    public static void main(String[] args) {
        String str = "Ashish";
        Interface_Structure ins = new Interface_Structure() {
            @Override
            public void learn(String str) {
                System.out.println("This a interface first method.");
                System.out.println("This abstract method parameterize-->" + str);
            }

            @Override
            public void work() {
                System.out.println("This a interface second method.");
                System.out.println("Interface variable is -->" + duration);
            }
        };
        ins.learn(str);
    }

}
