package com.company.business.concretes;

import com.company.business.abstracts.CustomerCheckService;
import com.company.entities.concretes.Customer;

import java.util.List;
import java.util.regex.Pattern;

public class CustomerCheckManager implements CustomerCheckService {
    List<Customer> customers;

    public CustomerCheckManager(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean checkFirstName(Customer customer) {
        if (customer.getFirstName().length() >= 2){
            System.out.println(customer.getFirstName() + " Geçerlidir.");
            return true;
        }else {
            System.out.println(customer.getFirstName() + " Geçersizdir. Lütfen 2 karakter ve üzeri bir değer girin.");
            return false;
        }
    }

    @Override
    public boolean checkLastName(Customer customer) {
        if (customer.getLastName().length() >= 2){
            System.out.println(customer.getLastName() + " Geçerlidir");
            return true;
        }else {
            System.out.println(customer.getLastName() + " Geçersizdir. Lütfen 2 karakter ve üzeri bir değer girin.");
            return false;
        }
    }

    @Override
    public boolean checkEmail(Customer customer) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        if (pattern.matcher(customer.getEmail()).find()){
            System.out.println(customer.getEmail() + " Email formatı geçerlidir.");
            return true;
        }else {
            System.out.println(customer.getEmail() + " Email formatı geçersizdir. Lütfen email formatında değer giriniz.");
            return false;
        }
    }

    @Override
    public boolean isEmailUnique(Customer customer) {
        boolean isUnique = true;
        for (Customer currentCustomer : customers){
            if (currentCustomer.getEmail() == customer.getEmail()){
                isUnique = false;
            }
        }

        if (isUnique){
            System.out.println(customer.getEmail() + " Başkası tarafından kullanılmıyor.");
            return true;
        }else {
            System.out.println(customer.getEmail() + " Başkası tarafından kullanılıyor. " +
                    "Lütfen kullanılmayan bir email giriniz.");
            return false;
        }
    }

    @Override
    public boolean checkPassword(Customer customer) {
        if (customer.getPassword().length() >= 6){
            System.out.println("Parola geçerlidir.");
            return true;
        }else {
            System.out.println(" Lütfen en az 6 karakterden oluşan bir parola giriniz.");
            return false;
        }
    }

    @Override
    public boolean isValid(Customer customer) {
        if (checkFirstName(customer) && checkLastName(customer) && checkEmail(customer) &&
                isEmailUnique(customer) && checkPassword(customer)){
            System.out.println(customer.getFirstName() + " doğrulandı");
            return true;
        }else {
            System.out.println(customer.getFirstName() + " kayıt bilgileri yanlış");
            System.out.println("-------------------------------------------------------------------------------------");
            return false;
        }
    }
}
