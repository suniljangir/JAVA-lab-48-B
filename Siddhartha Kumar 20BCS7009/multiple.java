class Animal{
    void eat(){System.out.println("eating");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking");}
}
class BabyDog extends Dog{
    void legs(){System.out.println("four legs");}
}
public class multiple {
    public static void main(String[] args) {
        BabyDog d= new BabyDog();
        d.eat();
        d.bark();
        d.legs();
    }
}
