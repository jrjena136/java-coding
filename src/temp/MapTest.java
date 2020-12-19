package temp;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        Address add1 = new Address("India", "Odisha", "756044");
        Address add2 = new Address("India", "Maharashtra", "411057");
        Set<Address> add = new HashSet<>();
        add.add(add1);
        add.add(add2);
        Student e1 = new Student(1, "RJ", "VI", add);
        Student e2 = new Student(2, "CP", "VII", add);
        Student e3 = new Student(3, "RD", "VIII", add);
        Student e4 = new Student(4, "YD", "IX", add);
        Set<Student> students = new HashSet<>();
        students.add(e1);
        students.add(e2);
        students.add(e3);
        students.add(e4);
        boolean isAvailable = students.stream().map(emp -> emp.getId()).collect(Collectors.toSet()).contains(1);
        System.out.println(isAvailable);
        
    }

}
