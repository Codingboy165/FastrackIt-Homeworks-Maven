package Exercitiul1Test;

import Exercitiul1.CelsiusAndFahrenheitCalculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CelsiusAndFahrenheit {
    @Test
    public void instantiateClass() {
         CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
    }

    @Test
    public void callMethodFahrenheitToCelsius() {
        CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
        CelsiusAndFahrenheitCalculator.fahrenheitToCelsius(20);
    }

    @Test
    public void callMethodCelsiusToFahrenheit() {
        CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
        CelsiusAndFahrenheitCalculator.celsiusToFahrenheit(20);
    }

    @Test
    public void fahrenheitToCelsiusMethodReturnsADouble() {
        CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
        double result =  CelsiusAndFahrenheitCalculator.fahrenheitToCelsius(20);
    }

    @Test
    public void celsiusToFahrenheitMethodReturnsADouble() {
        CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
        double result =  CelsiusAndFahrenheitCalculator.celsiusToFahrenheit(20);
    }

    @Test
    public void fahrenheitToCelsiusIsWorking() {
        //Given
        CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
        double fahrenheit = 100;

        //When
        double result = CelsiusAndFahrenheitCalculator.fahrenheitToCelsius(fahrenheit);

        //Then
        Assertions.assertThat(result).isEqualTo(37.77777777777778);
    }
    @Test
    public void CelsiusToFahrenheitIsWorking() {
        //Given
        CelsiusAndFahrenheitCalculator celsiusAndFahrenheitCalculator = new CelsiusAndFahrenheitCalculator();
        double celsius = 10;

        //When
        double result = CelsiusAndFahrenheitCalculator.celsiusToFahrenheit(celsius);

        //Then
        Assertions.assertThat(result).isEqualTo(50);

    }
}
