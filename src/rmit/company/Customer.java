package rmit.company;

import java.util.Date;

public class Customer {
    private String FirstName;
    private String LastName;
    private String FullName;
    private String Address;
    private Date DOB;
    private Boolean Subscribe;
    public Customer(String firstName, String lastName, String fullName, String address, Date DOB, Boolean subscribe) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.FullName = fullName;
        this.Address = address;
        this.DOB = DOB;
        this.Subscribe = subscribe;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Boolean getSubscribe() {
        return Subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        Subscribe = subscribe;
    }
}
