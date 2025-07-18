import java.util.Scanner;

public class HarfKontrol {
    public static void main(String[] args) {
        //Klavyeden girilen bir karakterin harf olup olmadığını kontrol eden program.
        // Eğer harf ise "bir harftir", değilse "bir harf değildir"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);
        scanner.close();

        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println(karakter + " bir harftir.");
        } else if (karakter >= '0' && karakter <= '9') {
            System.out.println(karakter + " bir harf değildir, bir rakamdır.");
        } else {
            System.out.println(karakter + " bir harf değildir.");
        }
    }
}
