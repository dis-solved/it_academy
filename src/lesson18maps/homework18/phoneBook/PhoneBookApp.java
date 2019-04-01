package lesson18maps.homework18.phoneBook;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNewContact(668555333,"John Doe");
        phoneBook.addNewContact(669551222,"Jane Doe");
        phoneBook.addNewContact(666666666,"Lorne Malvo");
        phoneBook.addNewContact(668555339,"Jack Daniels");
        phoneBook.addNewContact(668558333,"Nucky Thompson");
        phoneBook.addNewContact(668575333,"John Thackery");
        phoneBook.addNewContact(668655333,"Jack Torrance");
        phoneBook.addNewContact(668555334,"Robert Ledgard");

        System.out.println(phoneBook);

        phoneBook.removeContact(668555333,"John Doe");

        System.out.println(phoneBook);
        System.out.println("Nucky's number: " + phoneBook.findByName("Nucky Thompson"));
        System.out.println("668555334 is the number of " + phoneBook.findByNumber(668555334));

    }
}
