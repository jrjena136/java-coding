package test1;

public class Inheritance {

    public static void main(String[] args) {
        A b = new B();
        A c = new C();
        c = b;
        c.printName();
    }
}

class A {
    public void printName() {
        System.out.println("A");
    }
}

class B extends A {
    public void printName() {
        System.out.println("B");
    }
}
class C extends A {
    public void printName() {
        System.out.println("C");
    }
}
