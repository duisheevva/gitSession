package dao.implDao;

import dao.CustomerDao;
import db.DataBase;
import models.Customer;

public class CusromerDaoImpl implements CustomerDao {
    @Override
    public void createCustomer(Customer customer) {
        DataBase.customers.add(customer);
    }
}
