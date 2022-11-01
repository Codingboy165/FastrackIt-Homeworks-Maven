package Exercitiul1;

public class CelsiusAndFahrenheitCalculator {

    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(0));
    }
    public static double fahrenheitToCelsius(double temperature){
        return ((temperature-32)*5)/9;
    }
    public static double celsiusToFahrenheit(double temperature){
        return (temperature*9)/5+32;
    }
}
