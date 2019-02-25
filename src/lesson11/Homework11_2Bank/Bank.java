package lesson11.Homework11_2Bank;

public class Bank {

    public static double interestBalance;

    public static void transfer(BankAcc from, BankAcc to, double value){
        from.withdraw(1.01 * value);
        to.deposit(value);
        interestBalance = interestBalance + 0.01 * value;
    }

    public static double getInterestBalance(){
        return interestBalance;
    }
}
