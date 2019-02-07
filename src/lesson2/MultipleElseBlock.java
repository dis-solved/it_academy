package lesson2;

public class MultipleElseBlock {
    public static void main(String[] args){
        int age = 41;
        if (age < 13) {
            System.out.println("Am I a child?");
        } else if (age < 20){
            System.out.println("I am a teenager");
        } else if (age <= 40){
            System.out.println("Maybe I am not so old yet");
        } else {
            System.out.println("I am always 20!");
        }
    }
}
