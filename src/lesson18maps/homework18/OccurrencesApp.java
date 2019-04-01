package lesson18maps.homework18;

import java.util.*;

public class OccurrencesApp {
    static String text = "Bach enriched established German styles through his mastery of counterpoint, harmonic and motivic organisation, and his adaptation of rhythms, forms, and textures from abroad, particularly from Italy and France. Bach's compositions include hundreds of cantatas, both sacred and secular.[4] He composed Latin church music, Passions, oratorios, and motets. He often adopted Lutheran hymns, not only in his larger vocal works, but for instance also in his four-part chorales and his sacred songs. He wrote extensively for organ and for other keyboard instruments. He composed concertos, for instance for violin and for harpsichord, and suites, as chamber music as well as for orchestra. Many of his works employ the genres of canon and fugue.";

    public static void main(String[] args) {
         String[] words = text.toLowerCase().replaceAll("[,.]","").split(" ");
        List wordsAsList = Arrays.asList(words);
        Set<String> wordsSet = new HashSet<String>(wordsAsList);

        for (String s: wordsSet){
            System.out.println(s + " " + Collections.frequency(wordsAsList,s));
        }

    }

}
