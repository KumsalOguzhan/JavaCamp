package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.CustomerDao;
import com.company.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Hibernate ile eklendi : " + customer.getFirstName());
    }
}
