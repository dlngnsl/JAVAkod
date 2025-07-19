import java.util.Random;

public class DiziOrtalamaEnBuyukEnKucuk {
    public static void main(String[] args) {
        int[] dizi = new int[20];
        Random rand = new Random();
        int toplam = 0;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        // Diziye rastgele 1-100 arası değerler ata ve analiz yap
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(100) + 1; // 1-100 arası
            toplam += dizi[i];
            if (dizi[i] > enBuyuk) enBuyuk = dizi[i];
            if (dizi[i] < enKucuk) enKucuk = dizi[i];
        }

        double ortalama = (double) toplam / dizi.length;

        System.out.println("Dizi ortalaması: " + ortalama);
        System.out.println("En büyük değer: " + enBuyuk);
        System.out.println("En küçük değer: " + enKucuk);
    }
}
