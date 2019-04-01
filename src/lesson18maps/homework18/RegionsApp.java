package lesson18maps.homework18;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RegionsApp {
    public static void main(String[] args) {
        Map<String,Integer> regions = new HashMap<>();

        regions.put("MAZOWIECKIE",5_349_114);
        regions.put("ŚLĄSKIE",4_570_849);
        regions.put("WIELKOPOLSKIE",3_475_323);
        regions.put("MAŁOPOLSKIE",3_372_618);
        regions.put("DOLNOŚLĄSKIE",2_904_207);
        regions.put("ŁÓDZKIE",2_493_603);
        regions.put("POMORSKIE",2_307_710);
        regions.put("LUBELSKIE",2_139_726);
        regions.put("PODKARPACKIE",2_127_657);
        regions.put("KUJAWSKO-POMORSKIE",2_086_210);
        regions.put("ZACHODNIOPOMORSKIE",1_710_482);
        regions.put("WARMIŃSKO-MAZURSKIE",1_439_675);
        regions.put("ŚWIĘTOKRZYSKIE",1_257_179);
        regions.put("PODLASKIE",1_188_800);
        regions.put("LUBUSKIE",1_018_075);
        regions.put("OPOLSKIE",996_011);

        Integer max = Collections.max(regions.values());

        for (Map.Entry<String,Integer> entry: regions.entrySet()){
            if (entry.getValue() == max){
                System.out.println("The region with the greatest population in Poland is: " + entry.getKey());
            }
        }
    }
}
