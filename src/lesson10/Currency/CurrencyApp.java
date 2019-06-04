package lesson10.Currency;

import java.util.Arrays;

public class CurrencyApp {

    public static void main(String[] args) {
        Currency usdCurr = Currency.USD;


        System.out.println(usdCurr.getExchangeRate());

        Currency[] values = Currency.values();
        System.out.println(Arrays.toString(values));

        Currency pln = Currency.valueOf("PLN");
        System.out.println(pln.getExchangeRate());
    }
}
