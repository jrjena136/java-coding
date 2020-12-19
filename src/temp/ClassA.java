package temp;

public class ClassA {

    private ClassA() {
        System.out.println("ClassA private constructor");
    }

    public ClassA(String s) {
        System.out.printf("ClassA public constructor with arg : %s", s);
        System.out.println();
    }

    public void display() {
        System.out.println("ClassA display");
    }
}
