package lesson11.Homework11_4CapitalLetters;

public class CapitalLetters {
    public static void main(String[] args) {
        String sentence = "To see a World in a Grain of Sand";
        System.out.println(getCapitalLetters(sentence));

    }
    public static String getCapitalLetters(String sentence){
        String capital = "";

        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if (Character.isUpperCase(c)){
                capital += c;
            }
        }
        return capital;
    }
}
