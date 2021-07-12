package com.company.business.concretes;

import com.company.business.abstracts.CustomerCheckService;
import com.company.business.abstracts.CustomerService;
import com.company.core.RegisterService;
import com.company.dataAccess.abstracts.CustomerDao;
import com.company.entities.concretes.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {
    CustomerDao customerDao;
    RegisterService registerService;
    CustomerCheckService customerCheckService;
    List<Customer> customers;

    public CustomerManager(CustomerDao customerDao, RegisterService registerService,
                           CustomerCheckService customerCheckService, List<Customer> customers) {
        this.customerDao = customerDao;
        this.registerService = registerService;
        this.customerCheckService = customerCheckService;
        this.customers = customers;
    }

    @Override
    public void registerWithHibernate(Customer customer) {
        if (customerCheckService.isValid(customer)){
            customerDao.add(customer);
            customers.add(customer);
            verifyYourEmail(customer);
        }
    }

    @Override
    public void registerWithGoogle(Customer customer) {
        if (customerCheckService.isValid(customer)){
            registerService.registerToSystem(customer);
            customers.add(customer);
            verifyYourEmail(customer);
        }
    }

    @Override
    public void login(String email, String password) {
        boolean loginState = false;
        for (Customer currentCustomer : customers){
            if (currentCustomer.getEmail() == email && currentCustomer.getPassword() == password){
                System.out.println(currentCustomer.getFirstName() + " hoşgeldiniz.");
                System.out.println("---------------------------------------------------------------------------------");
                loginState = true;
            }
        }
        if (loginState == false){
            System.out.println("giriş bilgileri yanlış");
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void verifyYourEmail(Customer customer) {
        System.out.println("Your email address has been verified.");
        System.out.println("-----------------------------------------------------------------------------------------");
        customer.setVerified(true);
    }
}
