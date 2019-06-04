package lesson14;

import lesson11.Person;

/**
 * unchecked - not desireable to handle unchecked exceptions, but you can if you want
 * checked exceptions - exceptions you must handle, otherwise code will not compile
 * main class of all exceptions and errors in Java:
 * Throwable:
 * ** Error - we don't need to handle errors, mostly hardware errors
 * ** Exceptions - mostly software errors, we should handle them:
 * *** runtime exceptions, e.g. NullPointer ex, ArrayIndexOutOfBound
 * *** all other exceptions, e.g. FileNotFound
 *
 *
 * wrapping checked exceptions in runtime exceptions -do poczytania
 *
 * 1) try catch - executes all code after catch, but only when exception occures, catch can be declared multiple times in each trycatch block
 * 2) try finally - does not execute the code after finally, and finally will be executed no matter if exceptions occures or not
 *    finally can be declared only one time for each try catch block
 * 3) try-with-resources
 *
 * Throwable
 * Exception
 * Error(unchecked)
 * RuntimeExceptions (unchecked)
 * all other exceptions
 *
 */

public class Exceptions {
    public static void main(String[] args) {
        Person s = null;
        Person p = new Person("Jane", "Doe");

        try {
            s.toString();
        } catch (RuntimeException e){
            System.out.println("error occured");
        }

        try{
            s.toString();
        } finally {
            System.out.println("finally block");
        }

        try{
            s.toString();
        } catch (RuntimeException e){
            System.out.println("catch: error occured");
        } finally {
            System.out.println("finally: error");
        }

    }
}
