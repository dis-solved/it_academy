package lesson13;

public class Shoelaces {
    public static void main(String[] args) {
        String tie = null;
        while (tie == null)
            tie = "shoelace";

        System.out.print(tie);

        String[][] listing = new String[][] { { "Book", "34.99" },
                { "Game", "29.99" }, { "Pen", ".99" } };

        System.out.println(listing.length + " " + listing[0].length);

        int fish = 1 + 2 * 5>=2 ? 4 : 2;
        int mammals = 3 < 3 ? 1 : 5>=5 ? 9 : 7;

        System.out.print(fish+mammals+"");
    }
}