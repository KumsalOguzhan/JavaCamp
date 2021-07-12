package com.company.googleRegistration;

import com.company.entities.concretes.Customer;

public class GoogleRegisterManager {
    public void registerWithGoogle(Customer customer){
        System.out.println(customer.getFirstName() + " Google ile giriş yapıldı");
    }
}
