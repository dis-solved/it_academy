package lesson11.Homework11_2Bank;

public class BankApp {
    public static void main(String[] args) {
        User user = new User(5);
        user.setName("Paul");
        BankAcc bankAcc = new BankAcc();
        BankAcc bankAcc2 = new BankAcc();
        Bank millennium = new Bank();

        bankAcc.deposit(150);
        bankAcc2.deposit(100);


        user.addBankAccs(bankAcc);
        user.addBankAccs(bankAcc2);

        user.printUserInfo();

        millennium.transfer(bankAcc,bankAcc2,75);
        System.out.println("Interest Balance: " + millennium.getInterestBalance());

        user.printUserInfo();

        Bank.transfer(bankAcc2,bankAcc,50);

        System.out.println("Interest Balance: " + millennium.getInterestBalance());

        user.printUserInfo();
    }
}
