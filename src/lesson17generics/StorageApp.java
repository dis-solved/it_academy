package lesson17generics;

import java.util.ArrayList;
import java.util.List;

public class StorageApp {
    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<>(); // string storage
        Storage<Integer> storage2 = new Storage<>(); // integer storage

        addStorageValue(storage1, "Hello");
        addStorageValue(storage2, 45);

        System.out.println("Storage1: " + storage1);
        System.out.println("Storage2: " + storage2);

        Object value = storage1.getValue();
        String stringValue = (String) value;

        System.out.println("obtained value: " + stringValue);
        Integer value2 = storage2.getValue();
        System.out.println("obtained value2: " + value2);

        List<Number> numbers = new ArrayList<>();
        numbers.add((Integer)6);
        numbers.add((Double) 6.5);

        Number number = numbers.get(1);
        System.out.println(number);
    }

    //raw type
    private static <T> void addStorageValue(Storage<T> storage, T value){
        storage.setValue(value);
//        storage.setValue("default");
    }

}
