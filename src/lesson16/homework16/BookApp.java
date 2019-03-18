package lesson16.homework16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookApp {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("What’s your favourite book?");
            String title = scanner.nextLine();
            System.out.println("Who’s the author?");
            String author = scanner.nextLine();
            books.add(new Book(title, author));
            System.out.println("Enter 'Y' if you want to add more books, otherwise press enter");
        } while (!scanner.nextLine().equals(""));

        Set authors = new HashSet();
        for (Book book: books){
            authors.add(book.getAuthor());
        }
        System.out.println("List of favourite authors: " + authors);

        if (!authors.contains("William Blake")){
            System.out.println("Advised to read: 'Auguries of Innocence' by William Blake ");
        }
    }
}