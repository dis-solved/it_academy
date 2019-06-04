//package lesson18maps.homework18.phoneBook;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//import java.util.Set;
//
//public class PhoneBookAdv {
//    Map<String, Set<Integer>> phoneBook = new HashMap<>();
//    int n = 0;
//
//    public void addNewContact(Integer number, String name) {
//        phoneBook.put(name, number);
//        n++;
//    }
//
//    public void removeContact(Integer number, String name) {
//        phoneBook.remove(number, name);
//    }
//
//    public Integer findByName(String name) {
//        for (Map.Entry<Integer, String> e : phoneBook.entrySet()) {
//            if (Objects.equals(name, e.getValue())) {
//                return e.getKey();
//            }
//        }
//        return null;
//    }
//
//    public String findByNumber(Integer number) {
//        return phoneBook.get(number);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PhoneBook phoneBook = (PhoneBook) o;
//        return Objects.equals(this.phoneBook, phoneBook.phoneBook);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(phoneBook);
//    }
//
//    @Override
//    public String toString() {
//        return "PhoneBook{" +
//                "phoneBook=" + phoneBook +
//                '}';
//    }
//
//}
