package lesson19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PathApp {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\KingaBlaszczynska\\Documents\\ITacademy\\src\\test.txt");
        Path path1 = Paths.get("C:","Users","KingaBlaszczynska","Documents","ITacademy","src","test.txt");

        int nameCount = path1.getNameCount();// count of the directory of all levels, root doesn't count as directory
        System.out.println(nameCount);

        Path otherFile = path1.resolve("other.file"); // returns new path path1 + other.file
        System.out.println(otherFile);

        System.out.println(Files.isDirectory(path1));
//        System.out.println(Files.createDirectory(Paths.get("new_dir")));

        List<String> strings = Files.readAllLines(path1);
        System.out.println(strings);

        Files.write(Paths.get("C:\\Users\\KingaBlaszczynska\\Documents\\ITacademy\\src\\test33.txt"),
                Arrays.asList("New hello world", "second line"));

    }
}
