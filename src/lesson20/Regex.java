package lesson20;

//Regular expressions

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".*"); // any number of any characters . stands for any character
        Pattern pattern = Pattern.compile("a+"); // at least one a
        Pattern pattern1 = Pattern.compile("a?"); // is there or not
        Pattern pattern3 = Pattern.compile("(ab)+"); // in regular brackets we make a group, then we can check e.g. if it's repeated at least one time
        Pattern pattern2 = Pattern.compile("a{3,4}"); // between 3 and 4 a's
        Pattern pattern4 = Pattern.compile("[abc]+");// any number of any of given single chars should match, no matter of the order
        Pattern.compile("Hel.o World[^!]?"); // ^ exclusion sign, so it cannot end with exclamation mark
//        if we want to check for dots exactly, we should use [.]
        Matcher matcher = p.matcher("abcd");
        Matcher m1 = pattern4.matcher("cba");

        boolean matches = matcher.matches();
        System.out.println(matches);

        boolean matches2 = m1.matches();
        System.out.println(matches2);

        String input = "qwe";
        boolean matches1 = input.matches("\\w*"); // this is good for one time, but introduces performance problems for lists for example
        System.out.println(matches1);
    }
}
