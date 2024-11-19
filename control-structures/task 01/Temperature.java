import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        double temp;

        System.out.println ("What's the temperature at your location to one decimal place?");
        System.out.println ("Please enter a temperature in  degree Celcius");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        temp = scan.nextDouble();
        temp = Double.parseDouble(temp);

        //How can i check or restrict the user enter to entering a decimal number

        double fahrenheit = 9/5 * Celsius + 32;

        System.out.println (temp + " degrees Celsius corresponds to " + fahrenheit + " degrees Fahrenheit.");
    }
}