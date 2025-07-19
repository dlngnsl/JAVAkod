import java.util.Random;

public class DiziOrtalamaAnaliz {
    public static void main(String[] args) {
        int[] A = new int[20];
        Random rand = new Random();
        int toplam = 0;

        // Diziye rastgele sayılar ata ve toplamı hesapla
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100) + 1; // 1-100 arası rastgele sayı
            toplam += A[i];
        }

        double ortalama = (double) toplam / A.length;
        int buyukSayisi = 0;

        // Ortalamadan büyük elemanları say
        for (int i = 0; i < A.length; i++) {
            if (A[i] > ortalama) {
                buyukSayisi++;
            }
        }

        System.out.println("Dizi ortalaması: " + ortalama);
        System.out.println("Ortalamadan büyük eleman sayısı: " + buyukSayisi);
    }
}
