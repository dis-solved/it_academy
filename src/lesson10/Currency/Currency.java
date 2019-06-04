package lesson10.Currency;

// special kind of class which provides a limited set of available values (only capital letter, no spaces)
public enum Currency {
    USD(3.8),
    EUR(4.3),
    PLN(1.0);

    private double ExchangeRate;

    Currency(double exchangeRate){
        this.ExchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return ExchangeRate;
    }
}