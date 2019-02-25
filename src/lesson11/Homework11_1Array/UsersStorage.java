package lesson11.Homework11_1Array;

import java.util.Arrays;

public class UsersStorage {
    String[] names = new String[] {"Kasia", "Basia", "Michalina", "Dobromiła", "Halina"};

    public String getFirstUserName(String[] names){
        return names[0];
    }

    public String getAllUserNames(String[] names){
        return Arrays.toString(names)
                .replace("[","")
                .replace("]","");
    }
}