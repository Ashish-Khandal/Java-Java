package OOPsWithJava;

class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super(); // * If we are not use the super keyword then automatic call super method.
        System.out.println("dog is created");
    }
}
class SuperConstuctor{
    public static void main(String[] args){
        Dog d=new Dog();
    }
}