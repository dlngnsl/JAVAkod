import java.util.Scanner;

public class KoordinatBolgesi {
    public static void main(String[] args) {
        // Klavyeden girilen x ve y koordinatlarının hangi bölgede olduğunu belirleyen program.
        Scanner scanner = new Scanner(System.in);
        System.out.print("x değerini giriniz: ");
        int x = scanner.nextInt();
        System.out.print("y değerini giriniz: ");
        int y = scanner.nextInt();
        scanner.close();

        if (x > 0 && y > 0) {
            System.out.println("1. bölgede yer alıyor.");
        } else if (x < 0 && y > 0) {
            System.out.println("2. bölgede yer alıyor.");
        } else if (x < 0 && y < 0) {
            System.out.println("3. bölgede yer alıyor.");
        } else if (x > 0 && y < 0) {
            System.out.println("4. bölgede yer alıyor.");
        } else if (x == 0 && y == 0) {
            System.out.println("Nokta orijinde (0,0) yer alıyor.");
        } else if (x == 0) {
            System.out.println("Nokta Y ekseni üzerinde.");
        } else if (y == 0) {
            System.out.println("Nokta X ekseni üzerinde.");
        }
    }
}
