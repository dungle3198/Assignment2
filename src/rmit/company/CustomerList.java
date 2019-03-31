package rmit.company;

import java.util.List;

public class CustomerList {
    private List<Customer> list;

    public void addCustomer(Customer c){
        this.list.add(c);
    }
    public void removeCustomer(Customer c){
        this.list.remove(c);
    }
}
