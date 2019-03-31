package rmit.company;
//Allow to add/edit/delete/view a list of customer.
// Info of a customer includes name, birthday, address, phone, email
import java.util.ArrayList;
import java.util.List;

public class LotteryStore {
    private List<Customer>  listOfCustomer = new ArrayList<Customer>();

    public void addCustomer(Customer client)
    {
       listOfCustomer.add(client);
    }
    public void removeCustomer(Customer client)
    {
        listOfCustomer.remove(client);
    }

    public List<Customer> getListofCustomer() {
        return listOfCustomer;
    }

}
