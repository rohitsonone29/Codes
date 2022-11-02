package customexception;

import java.util.ArrayList;
import java.util.List;

import collections.Employee;

public class ArrayListAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> lst = new ArrayList<Account>();

		Account a = new Account("Rahul",10764,5000);
        Account a1 = new Account("Abhi",10890,45000);

        Account a2 = new Account("Abhi",10890,45000);

        lst.add(a);
        lst.add(a1);        

        lst.add(new Account("Akshay",10430,76000));
        lst.add(new Account("Sham",10780,15000));
        
        boolean isPresent=lst.contains(a1);
        
        System.out.println("10764 account number is created:"+isPresent);

	}

}
