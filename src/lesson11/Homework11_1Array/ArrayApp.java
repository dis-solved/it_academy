package lesson11.Homework11_1Array;

public class ArrayApp {
    public static void main(String[] args) {
        UsersStorage usersStorage = new UsersStorage();

        System.out.println("First user name is: " + usersStorage.getFirstUserName(usersStorage.names));
        System.out.println("All user names are:\n" + usersStorage.getAllUserNames(usersStorage.names));
    }
}