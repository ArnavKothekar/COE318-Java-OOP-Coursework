package coe318.lab4;

public class Account {

    private String name;
    private int number;
    private double balance;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public boolean deposit(double amount){
        if (amount <= 0){
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }
    
    public boolean withdraw(double amount){
        if((amount <= this.balance) && (amount > 0)){
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
}
