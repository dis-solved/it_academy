package lesson19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesApp {
    public static void main(String[] args) throws IOException {
        // Windows uses \ separator
        // Unix uses / separator
        File file = new File("C:\\Users\\KingaBlaszczynska\\Documents\\ITacademy\\src\\test.txt");

        System.out.println("Directory: " + file.isDirectory());
        System.out.println("File: " + file.isFile());

        if (!file.exists()){
            boolean created = file.createNewFile();
            System.out.println("Created: " + created);
        }

        Scanner scanner = new Scanner(file);
        String firstline = scanner.nextLine(); // next line is next line, while .next is next token, so delimited by space
        System.out.println(firstline);

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
