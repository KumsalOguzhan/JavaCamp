package com.company;

import com.company.business.abstracts.CustomerCheckService;
import com.company.business.abstracts.CustomerService;
import com.company.business.concretes.CustomerCheckManager;
import com.company.business.concretes.CustomerManager;
import com.company.core.GoogleRegisterManagerAdapter;
import com.company.core.RegisterService;
import com.company.dataAccess.abstracts.CustomerDao;
import com.company.dataAccess.concretes.HibernateCustomerDao;
import com.company.entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        CustomerDao customerDao = new HibernateCustomerDao();
        RegisterService registerService = new GoogleRegisterManagerAdapter();
        CustomerCheckService customerCheckService = new CustomerCheckManager(customers);
        CustomerService customerService = new CustomerManager(customerDao, registerService, customerCheckService, customers);

        Customer customer1 = new Customer(1, "ali", "soy", "abc@gmail.com", "123456");
        Customer customer2 = new Customer(2, "o", "s", "abcdagasgmail.cafgdg","1234");
        Customer customer3 = new Customer(3, "selim", "demir", "abc@gmail.com", "12345678");
        Customer customer4 = new Customer(4, "abc", "abcde", "aaa@gmail.com", "123456789");

        customerService.registerWithHibernate(customer1);
        customerService.registerWithHibernate(customer2);
        customerService.registerWithHibernate(customer3);
        customerService.registerWithGoogle(customer4);

        customerService.login("abc@gmail.com", "123456");
        customerService.login("aaa@gmail.com", "123456");
    }
}
