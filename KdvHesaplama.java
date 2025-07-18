import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        // Klavyeden girilen ürün grubuna göre KDV oranını belirleyen ve KDV miktarını hesaplayan program.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün grubu giriniz (M: Market, Y: Yeme-İçme, D: Diğer): ");
        char grup = scanner.next().toUpperCase().charAt(0);
        System.out.print("Ürün fiyatını giriniz: ");
        double fiyat = scanner.nextDouble();
        scanner.close();

        double kdvOrani;
        switch (grup) {
            case 'M':
                kdvOrani = 0.01;
                break;
            case 'Y':
                kdvOrani = 0.10;
                break;
            default:
                kdvOrani = 0.20;
        }

        double kdvMiktari = fiyat * kdvOrani;
        System.out.println("Ödenmesi gereken KDV miktarı: " + kdvMiktari + " TL");
    }
}
