/*Write a program that asks the user to enter the following:
Values                  Data Type
Year                    Integer
Genre                   String
Album                   String
Title                   String
Artist                  String
*/

import java.util.Scanner;

public class  GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        String genre, album, title, artist;

        System.out.print("Enter the year : ");
        year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the genre: ");
        genre = scanner.nextLine();

        System.out.print("Enter the album : ");
        album = scanner.nextLine();

        System.out.print("Enter the song : ");
        title = scanner.nextLine();

        System.out.print("Enter the artist : ");
        artist = scanner.nextLine();

        System.out.println("----------------------");
        System.out.println("SONG DETAILS");
        System.out.println("----------------------");

        System.out.println("Year releasd : " + year);
        System.out.println("Genre : " + genre);
        System.out.println("Album : " + album);
        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);

		scanner.close();

    }
}
