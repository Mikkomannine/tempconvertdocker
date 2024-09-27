import org.junit.Test;
import static org.junit.Assert.*;

public class TempConverterTest {

    @Test
    public void testKelvinToFah_300Kelvin() {
        double kelvin = 300.1;
        double expectedFahrenheit = 81; // Expected rounded result
        double actualFahrenheit = TempConverter.kelvinToFah(kelvin);
        assertEquals("300.1 Kelvin should be approximately 80 Fahrenheit.", expectedFahrenheit, actualFahrenheit, 0.0);
    }

    @Test
    public void testKelvinToFah_ZeroKelvin() {
        double kelvin = 0;
        double expectedFahrenheit = -460; // Absolute zero in Fahrenheit
        double actualFahrenheit = TempConverter.kelvinToFah(kelvin);
        assertEquals("0 Kelvin should be -460 Fahrenheit.", expectedFahrenheit, actualFahrenheit, 0.0);
    }

    @Test
    public void testKelvinToFah_FreezingPoint() {
        double kelvin = 273.15;
        double expectedFahrenheit = 32; // Freezing point of water
        double actualFahrenheit = TempConverter.kelvinToFah(kelvin);
        assertEquals("273.15 Kelvin should be 32 Fahrenheit.", expectedFahrenheit, actualFahrenheit, 0.0);
    }

    @Test
    public void testKelvinToFah_BoilingPoint() {
        double kelvin = 373.15;
        double expectedFahrenheit = 212; // Boiling point of water
        double actualFahrenheit = TempConverter.kelvinToFah(kelvin);
        assertEquals("373.15 Kelvin should be 212 Fahrenheit.", expectedFahrenheit, actualFahrenheit, 0.0);
    }
}
