import java.util.Random;

public class DiziAnaliz {
    public static void main(String[] args) {
        // 1-200 arası rastgele 100 sayı üreten ve bu sayılarla ilgili analiz yapan program.
        // 100'den büyük sayı adedini, 200'den küçük sayıların ortalamasını ve çift sayı adedini hesaplar.
        int[] dizi = new int[100];
        Random rand = new Random();
        int yuzdenBuyuk = 0;
        int ciftSayisi = 0;
        int toplamKucuk200 = 0;
        int kucuk200Adet = 0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(200) + 1; // 1-200 arası
            if (dizi[i] > 100) yuzdenBuyuk++;
            if (dizi[i] % 2 == 0) ciftSayisi++;
            if (dizi[i] < 200) {
                toplamKucuk200 += dizi[i];
                kucuk200Adet++;
            }
        }

        double ortalamaKucuk200 = (kucuk200Adet > 0) ? (double)toplamKucuk200 / kucuk200Adet : 0;

        System.out.println("100'den büyük sayı adedi: " + yuzdenBuyuk);
        System.out.println("200'den küçük sayıların ortalaması: " + ortalamaKucuk200);
        System.out.println("Çift sayı adedi: " + ciftSayisi);
    }
}
