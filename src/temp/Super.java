package temp;

import java.io.IOException;

public class Super {
    public int a;

    static void doIt(int x, int y, int m) {
        if(x==5) {
            m=x;
        } else {
            m = y;
        }
    }

    static int err() throws Exception {
        try {
            throw new IOException("");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        finally {
            return -1;
        }
    }
public static void main(String[] args) throws Exception {
    boolean a = true;
    boolean b = false;
    boolean c = true;
    if (a & b | b&c | b) {
        System.out.println("ok");
    }
    if (a&b | b&c | b | a) {
        System.out.println("dokey");
    }
    int i=6, j=4, k=9;
    doIt(i, j, k);
    System.out.println(k);
    System.out.println(err());
    Thread t = new MyThread() {
        public void run() {
            System.out.println("foo");
        }
    };
    t.start();
    boolean a1 = false;
    if (a1=true) {
        System.out.println("Hello");
    } else {
        System.out.println("Goodbye");
    }
    }
}

class MyThread extends Thread {
    public MyThread() {
       System.out.println("MyThread");
    }
    public void run() {
        System.out.println("bar");
    }
    public void run(String s) {
        System.out.println("baz");
    }
}