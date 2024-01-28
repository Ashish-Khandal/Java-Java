package OOPsWithJava;

import java.util.*;
//! Abstract class rules:-
/*! An abstract class must be created with abstract keyword.
! An abstract class can be created without any abstract method.
! An abstract class may contain abstract methods and non-abstract methods.
! An abstract class may contain final methods that can not be overridden.
! An abstract class may contain static methods, but the abstract method can not be static.
! An abstract class may have a constructor that gets executed when the child class object created.
! An abstract method must be overridden by the child class, otherwise, it must be defined as an abstract class.
! An abstract class can not be instantiated but can be referenced.
*/

abstract class Shape {
    int length, breadth, radius;
    Scanner input = new Scanner(System.in);

    abstract void printArea();

}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("*** Finding the Area of Rectangle ***");
        System.out.print("Enter length and breadth: ");
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.println("The area of Rectangle is: " + length * breadth);
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("\n*** Finding the Area of Triangle ***");
        System.out.print("Enter Base And Height: ");
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.println("The area of Triangle is: " + (length * breadth) / 2);
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("\n*** Finding the Area of Circle ***");
        System.out.print("Enter Radius: ");
        radius = input.nextInt();
        System.out.println("The area of Circle is: " + 3.14f * radius * radius);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.printArea();

        Triangle tri = new Triangle();
        tri.printArea();

        Circle cir = new Circle();
        cir.printArea();

        //? This is an abstract type class so...
        //? Cannot create a Shape type object
        //? Find the runtime error
      /*!  Shape sp = new Shape();
       !   sp.printArea(); */

     /*  //  Base class reference to Child class instance
        * Shape obj = new Rectangle();
        * obj.printArea();
        * obj = new Triangle();
        * obj.printArea();
        * obj = new Circle();
        * obj.printArea();
        ? */
    }
}
