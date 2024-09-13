package lab4;


abstract class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }


}

class Dog extends  Animal{
    void sound()
    {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal{
    void sound()
    {
        System.out.println("Cat sound");
    }
}

public class AbstractExample {
    public static void main(String[] args) {


        Animal animal = new Dog();
        animal.sound();

        Animal animal1 = new Cat();
        animal1.sound();
    }
}
