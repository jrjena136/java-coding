package temp;

public class Address {
    private String country;
    private String state;
    private String pincode;
    public Address(String country, String state, String pincode) {
        this.country = country;
        this.state = state;
        this.pincode = pincode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
