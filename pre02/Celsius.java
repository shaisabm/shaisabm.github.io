import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {

    Scanner cel = new Scanner(System.in);
    System.out.print("Enter temperature in Celsius: ");
    double celsius = cel.nextDouble(); // Asking for an input
    double fahrenheit = (9.0 / 5) * celsius + 32; // Conversion formula
    System.out.println("Temperature in Fahrenheit: " + fahrenheit + "F"); // Display the result

  }

}