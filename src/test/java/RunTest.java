import org.apache.commons.configuration.ConfigurationException;
import org.junit.jupiter.api.Test;


import java.io.IOException;

public class RunTest {
    @Test
    public void login() throws IOException, ConfigurationException {
        Customer customer=new Customer();
        customer.callingLoginAPI();
    }
    @Test
    public void getList() throws IOException {
        Customer customer=new Customer();
        customer.customerList();
    }
    @Test
    public void Info() throws IOException {
        Customer customer=new Customer();
        customer.customerSearch();
    }
    @Test
    public void createNew() throws IOException, ConfigurationException {
        Customer customer=new Customer();
        customer.AddCustomer();
    }
    @Test
    public void AddNew() throws ConfigurationException, IOException {
        Customer customer=new Customer();
        customer.createCustomer();
    }
    @Test
    public void update() throws IOException {
        Customer customer=new Customer();
        customer.updateCustomer();
    }
    @Test
    public void delete() throws IOException {
        Customer customer=new Customer();
        customer.deleteCustomer();
    }

}
