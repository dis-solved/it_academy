package lesson11.Test;

public class BankAcc {

    private double balance;

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdraw(double value){
        balance = balance - value;
    }

    public double getBalance() {
        return balance;
    }
}
