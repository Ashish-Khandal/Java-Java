package OOPsWithJava;
class Student1{
    String name;
    int age;
    float salary;
    void display(String name){
        System.out.println(name);
    }
    void display(int age){
        System.out.println(age);
    }
}
class Teacher extends Student1{
    void display(float salary){
        System.out.println(salary);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Teacher T = new Teacher();
        T.display("Ashish");
        T.display(22);
        T.display(100000.99f);
    }
}
