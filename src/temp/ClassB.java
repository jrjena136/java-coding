package temp;

public class ClassB extends ClassA implements InterfaceA {

    public ClassB(String s) {
        super(s);
    }

    @Override
    public void print() {
        System.out.println("ClassB print");
    }

    @Override
    public void display() {
        System.out.println("ClassB display");
    }
}
