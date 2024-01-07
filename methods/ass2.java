import java.util.Scanner;

public class TemperatureConverter {
     public static double convertToFahrenheitToCelsius(double fahrenheit) {
        // Formula to convert Fahrenheit to Celsius
        return (5.0 / 9) * (fahrenheit - 32);
     }
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in degrees Fahrenheit: ");

        // Read temperature in Fahrenheit from the user
        double fahrenheit = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Convert Fahrenheit to Celsius
        double celsius = convertToFahrenheitToCelsius(fahrenheit);

        // Display the result with two decimal places
        System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
    }

   
}
