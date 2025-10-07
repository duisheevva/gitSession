package service.impl;

import dao.CustomerDao;
import dao.implDao.CusromerDaoImpl;
import models.Customer;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService
{
    private CustomerDao customerDao = new CusromerDaoImpl();
    @Override
    public void createCustomer(Customer customer) {
        customerDao.createCustomer(customer);
    }
}
