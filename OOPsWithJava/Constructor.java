package OOPsWithJava;

class Show {
    // ! Constructor always create by same class name.
    // ? Constructor should not return a value even void also.
    // * Constructor cannot be inheritance.
    // Example:-
                /* public interface InterfaceTest {
                    public InterfaceTest(){
                    }
                    public abstract void display();
                    public abstract void Show();
                }*/
    // ? Default Constructor / non parameterised / zero argument Constructor.
    Show() {
        System.out.println("This is a Constructor of Show class.");
    }

    Show(int a, int b) {
        // parameterised Constructor.
        //? Constructor overloading.
        int c = a + b;
        System.out.println(c);
    }

    Show(float a, float b) {
        // parameterised Constructor.
        //? Constructor overloading.
        float c = a + b;
        System.out.println(c);
        //Type casting.
        int d = (int) a + (int) b;
        System.out.println(d);
    }
}

class Show1 extends Show {
    Show1() {
        System.out.println("This is a method of extends Show1 class .");
    }

    Show1(int a, int b) {
        super(5, 4); //! this is a copy of show constructor.
        int c = a + b;
        System.out.println(c);
    }
}

class Student {
    String name;
    int age;

    Student(String n, int m) {
//       * this.name = n;
//       * this.age = m;
        System.out.println("Your name and age:- " + n + ", " + m);
    }

    Student(Student s) {
        //! object create
        name = s.name;
        age = s.age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Show obj1 = new Show(5, 10);
        Show obj2 = new Show(5.10f, 10.91f);
        Show1 obj3 = new Show1();
        Show1 obj4 = new Show1(10, 20);

        // create new objects.
        Student s = new Student("Ashish", 22);
        Student s2 = new Student(s);
//        OOPsWithJava.Student st = new OOPsWithJava.Student(Ashish,21);
    }
}
