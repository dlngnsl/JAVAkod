import java.util.Scanner;

public class ArtikYilSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();
        scanner.close();

        int durum = 0;
        if (yil % 400 == 0) {
            durum = 1;
        } else if (yil % 100 == 0) {
            durum = 2;
        } else if (yil % 4 == 0) {
            durum = 1;
        } else {
            durum = 0;
        }

        switch (durum) {
            case 1:
                System.out.println(yil + " artık yıldır.");
                break;
            case 2:
                System.out.println(yil + " artık yıl değildir.");
                break;
            default:
                System.out.println(yil + " artık yıl değildir.");
        }
    }
}
