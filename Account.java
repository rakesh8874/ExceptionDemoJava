package com.jap.customexception;

public class Account {

    private int accountBalance;

    public Account(int accountBalance) {

        this.accountBalance = accountBalance;
    }
    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public int  withdraw(int  amount) throws InsufficientFundException
    {
        int remainingBalance = getAccountBalance()-amount;
        if(getAccountBalance()<amount){
            throw new InsufficientFundException();
        }
        return remainingBalance;
    }
}
