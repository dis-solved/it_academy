package lesson11.Homework11_2Bank;

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
