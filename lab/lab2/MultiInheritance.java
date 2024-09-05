package lab2;


interface A{
    void display();
}

interface B{
    void display();
    void showHello();
}


class C implements A,B{

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void showHello() {
        System.out.println("Show Hello");

    }
}



public class MultiInheritance {
    public static void main(String[] args) {

        C c = new C();
        c.display();
        c.showHello();

    }
}
