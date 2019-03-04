package lesson13;

public class Equivalency {
    public static void main(String[] edges) {
        final String ceiling = "up";
        String floor = new String("up");
        final String wall = new String(floor);

        System.out.print((ceiling == wall) + " " + (floor==wall) + " " + ceiling.equals(wall));
    }
}