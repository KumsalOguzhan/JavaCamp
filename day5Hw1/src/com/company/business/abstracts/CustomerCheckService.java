package com.company.business.abstracts;

import com.company.entities.concretes.Customer;

public interface CustomerCheckService {
        boolean isValid(Customer customer);
        boolean checkFirstName(Customer customer);
        boolean checkLastName(Customer customer);
        boolean checkEmail(Customer customer);
        boolean isEmailUnique(Customer customer);
        boolean checkPassword(Customer customer);
}
