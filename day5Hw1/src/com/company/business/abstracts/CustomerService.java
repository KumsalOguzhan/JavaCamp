package com.company.business.abstracts;

import com.company.entities.concretes.Customer;

public interface CustomerService {
    void registerWithHibernate(Customer customer);
    void registerWithGoogle(Customer customer);
    void login(String email, String password);
    void verifyYourEmail(Customer customer);
}
