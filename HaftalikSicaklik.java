import java.util.Scanner;

public class HaftalikSicaklik {
    public static void main(String[] args) {
        // Haftalık sıcaklık ortalamasını hesaplayan program
        double[] sicakliklar = new double[7];
        Scanner scanner = new Scanner(System.in);
        double toplam = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print((i+1) + ". gün sıcaklığını giriniz: ");
            sicakliklar[i] = scanner.nextDouble();
            toplam += sicakliklar[i];
        }
        scanner.close();

        double ortalama = toplam / 7;
        System.out.println("Haftalık sıcaklık ortalaması: " + ortalama);
    }
}
