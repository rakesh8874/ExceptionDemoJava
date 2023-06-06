package com.jap.customexception;

import java.util.Scanner;

public class AccountImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Account Balance");
        int accBalance  = scanner.nextInt();
        System.out.println("Enter The Amount You want to Withdraw");
        int withdrawAccount = scanner.nextInt();
        Account account = new Account(accBalance);
        try {
            int revisedAccBalance = account.withdraw(withdrawAccount);
            System.out.println("Your Account Balance is : "+revisedAccBalance);
        }catch(InsufficientFundException e){
            System.out.println(e);
        }
        }
}
