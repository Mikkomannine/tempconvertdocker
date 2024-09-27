public class TempConverter {

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFah(double kel) {
        return Math.round((kel - 273.15) * (9.0 / 5.0) + 32);
    }

    public static void main(String[] args) {
        // Example usage
        double kelvin = 300.1;
        double fahrenheit = kelvinToFah(kelvin);
        System.out.println(kelvin + " Kelvin is equal to " + fahrenheit + " Fahrenheit.");
    }
}

