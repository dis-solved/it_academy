package lesson4.Homework4.Homework4_3cd_CelsiusToFarenheit;

public class Temperature {
    double temperatureInCelsius;

    Temperature(double tempInCelsius){
        temperatureInCelsius = tempInCelsius;
    }

    public double convertToFarenheit(){
        double temperatureInFarenheit = (temperatureInCelsius * 9 / 5) + 32;
        return temperatureInFarenheit;
    }
}
