package temp;

import java.util.Set;

public class Student {
    private int id;
    private String name;
    private String standard;
    private Set<Address> address;
    public Student(int id, String name, String standard, Set<Address> address) {
        this.id = id;
        this.name = name;
        this.standard = standard;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStandard() {
        return standard;
    }
    public void setStandard(String standard) {
        this.standard = standard;
    }
    public Set<Address> getAddress() {
        return address;
    }
    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}
