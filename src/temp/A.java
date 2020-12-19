package temp;

import java.util.Base64;

public class A {

    public static void main(String[] args) {
        /*Employee E1 = new Employee(1, "A");
        System.out.println(E1.hashCode());
        Employee E2 = new Employee(1, "A");
        System.out.println(E2.hashCode());
        Map<String, Employee> map = new HashMap<>();
        map.put("e1", E1);
        map.put("e1", E2);
        
        Employee x = map.get("e1");
        System.out.println(x.hashCode());*/
        int x = new Long(20 * 1024 * 1024).intValue();
        int val = (int) (20 * 1024 * 1024);
        System.out.println(x);
        System.out.println(val);
        System.out.println(Integer.MAX_VALUE);
        String usernamePassword = "nodejs-connect:1074274e-84ed-4c8f-b9a1-9e7c2191d0da";
        String encoded = Base64.getEncoder().encodeToString(usernamePassword.getBytes());
        System.out.println(encoded);
    }
}

class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}