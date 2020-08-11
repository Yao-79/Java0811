package com.pcschool.ocp.d01;

public class Account {    
    private int balance;
    
    public void save(int money){
        if(money>0){
            balance=balance+money;       
        }
       
    }
    public void withdraw(int money){
        if(money>0 && balance>=money){
            balance=balance-money;       
        }
    
    }
    
    public int getBalance(){
        return balance;
    }
    
    
}
