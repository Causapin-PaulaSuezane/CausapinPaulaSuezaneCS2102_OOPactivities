public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Anna Pavlova", "Russian", 25, "The Dying Swan", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();

        Writer writer = new Writer("Agatha Christie", "British", 62, "Detective Novels", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Elisabeth Vigee Le Brun", "French", 23, "Portrait Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();
    }
}