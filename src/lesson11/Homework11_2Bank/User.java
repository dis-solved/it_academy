package lesson11.Homework11_2Bank;

//1 user
//2 Bank accounts
//3 User may have bank accounts
//4 you can create user with 5 Bank acc
//5 bank can assign bank account to a user


public class User {
    private BankAcc[] bankAccs;
    private int accountsLength = 0;
    private String name;

    public User(int numberOfAccounts){
        this.bankAccs = new BankAcc[numberOfAccounts];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBankAccs(BankAcc bankAcc) {
        if (accountsLength == 5){
            return;
        }
        bankAccs[accountsLength] = bankAcc;
        accountsLength++;
    }

    public void printUserInfo(){
        System.out.println("Name: " + this.name);
        for (int i = 0; i < accountsLength; i++){
            BankAcc a = bankAccs[i];
            System.out.println("account: " + a.getBalance());
        }
    }
}
