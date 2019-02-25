package lesson11.Test;

public class BankApp {
    public static void main(String[] args) {
        User user = new User(5);
        user.setName("Paul");
        BankAcc bankAcc = new BankAcc();
        BankAcc bankAcc2 = new BankAcc();

        bankAcc.deposit(150);
        bankAcc2.deposit(100);


        user.addBankAccs(bankAcc);
        user.addBankAccs(bankAcc2);

        user.printUserInfo();

        transfer(bankAcc,bankAcc2,75);

        user.printUserInfo();
    }

    public static void transfer(BankAcc from, BankAcc to, double value){
        from.withdraw(value);
        to.deposit(value);
    }
}
