package temp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public interface InterfaceA {
    public void print();

    public static InterfaceA getType () {
        Constructor ctor;
        try {
            ctor = Class.forName("temp.ClassB").getDeclaredConstructor(String.class);
            ctor.setAccessible(true);
            return (InterfaceA)ctor.newInstance("B");
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException |
                InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
