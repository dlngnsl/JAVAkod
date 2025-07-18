import java.util.Scanner;

public class KursKabulKontrol {
    public static void main(String[] args) {
        //Aşşağıdaki ölçütleri temel alarak öğrencinin bir kursa kabul edilmeye uygun olup olmadığını kontrol eden programı yazınız:
        // 1. Matematik notu en az 65 olmalı.
        // 2. Fizik notu en az 55 olmalı.
        // 3. Kimya notu en az 50 olmalı.
        // 4. Toplam not (Matematik + Fizik + Kimya) en az 190 olmalı veya Matematik ve Fizik notlarının toplamı en az 140 olmalı.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        int matematik = scanner.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        int fizik = scanner.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        int kimya = scanner.nextInt();
        scanner.close();

        int toplam = matematik + fizik + kimya;
        int matFizToplam = matematik + fizik;

        boolean kabul = (matematik >= 65 && fizik >= 55 && kimya >= 50) && (toplam >= 190 || matFizToplam >= 140);

        if (kabul) {
            System.out.println("Öğrenci kursa kabul edildi.");
        } else {
            System.out.println("Öğrenci kursa kabul edilmedi.");
        }
    }
}
