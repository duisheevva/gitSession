import models.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        Customer customer1 = new Customer("A", "a@gmail.com", LocalDate.now(), "+996700000");
        Customer customer2 = new Customer("B", "b@gmail.com", LocalDate.now(), "+996700000");
        Customer customer3 = new Customer("C", "c@gmail.com", LocalDate.now(), "+996700000");
        customerService.createCustomer(customer1);
        customerService.createCustomer(customer2);
        customerService.createCustomer(customer3);
    }
}