package OOPsWithJava;

class A {
    void show() {
        System.out.println("This is a method of class OOPsWithJava.A.");
    }

    int show1(int a, int b) {
        int c = a + b;
        return c;
    }
}
class B extends A {
    void show2(){
        // ! we are call the method this type.
        show();

        System.out.println("This is a method of extends class.");
    }
}
class Demo{
    A demo = new A();
    void demo1(){
        B d1 = new B();
        d1.show();
    }
}
public class Inheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.show2();
        obj.show();
        System.out.println(obj.show1(5,10));
        Demo d = new Demo();
        d.demo1();

    }
}
