public class BolunmeAnaliz {
    public static void main(String[] args) {
        // 1-100 arasındaki 5'e tam bölünüp 3'e tam bölünemeyen sayıları bulan ve analiz eden program.
        // Bu sayıları ekrana yazdırır, toplamını ve adetini hesaplar.
        int sayac = 0;
        int toplam = 0;
        System.out.print("5'e tam bölünüp 3'e tam bölünemeyen sayılar: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
                sayac++;
                toplam += i;
            }
        }
        System.out.println();
        System.out.println("Adet: " + sayac);
        System.out.println("Toplam: " + toplam);
    }
}
