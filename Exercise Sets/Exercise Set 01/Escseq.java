public class Escseq{
    public static void main(String[] args) {
        int start = 1; 
        int count = 5; 
        for (int i = 0; i < count; i++) {
            int multipleOfSeven = start * 7;
            
            if (i % 2 == 0) {
               
                System.out.println(multipleOfSeven);
            } else {
                System.out.println("\t" + multipleOfSeven);
            }
            
            start++;
        }
    }
}
