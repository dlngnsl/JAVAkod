import java.util.Scanner;

public class UnluHarfKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir harf giriniz: ");
        char harf = scanner.next().toLowerCase().charAt(0);
        scanner.close();

        switch (harf) {
            case 'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                System.out.println(harf + " bir ünlü harftir.");
                break;
            default:
                System.out.println(harf + " bir ünlü harf değildir.");
        }
    }
}
