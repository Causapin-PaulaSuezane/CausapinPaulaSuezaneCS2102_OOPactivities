import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the multiplication table: ");
        int max = input.nextInt();
        
        int[][] table = new int[max][max];
        
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.printf("%4d", table[i - 1][j - 1]);
            }
            System.out.println();
        }
        
        input.close();
    }
}
