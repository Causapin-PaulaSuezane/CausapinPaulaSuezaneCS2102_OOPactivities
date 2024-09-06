/*Write a program that asks the user for two characters, 
  and will show the character with greater value followed by the ASCII codes of each character.
 */

import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Getting the Greater Value");
        
        System.out.print("Enter the first character : ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Enter the second character : ");
        char char2 = scanner.next().charAt(0);

        int ascii1 = (int) char1;
        int ascii2 = (int) char2;

        int maxAscii = Math.max(ascii1, ascii2);
        
        char greaterChar = (char) maxAscii;

        System.out.println("-----------------------------------");
        System.out.println("The character with the greater value is : " + greaterChar);
        System.out.println("-----------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + " : " + ascii1);
        System.out.println(char2 + " : " + ascii2);

        scanner.close();
    }



    
}
