import java.util.Scanner;

class Tempconverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a celsius value: ");
        float celsius = scanner.nextFloat();
        
        float f = celsius * (9.0f / 5.0f) + 32;
        
        System.out.println(celsius + " Celsius is " + f + " Fahrenheit");
       
        scanner.close();
    }
}
