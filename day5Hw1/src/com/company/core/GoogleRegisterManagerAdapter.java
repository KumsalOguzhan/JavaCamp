package com.company.core;

import com.company.entities.concretes.Customer;
import com.company.googleRegistration.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService{
    @Override
    public void registerToSystem(Customer customer) {
        GoogleRegisterManager manager = new GoogleRegisterManager();
        manager.registerWithGoogle(customer);
    }
}
