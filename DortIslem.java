import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {
        // Klavyeden girilen iki sayıyı toplayan, çıkaran, çarpan ve bölen program.
        // Kullanıcıdan iki sayı ve bir işlem operatörü (+, -, *, /)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();
        System.out.print("İşlem seçiniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);
        scanner.close();

        double sonuc;
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem operatörü girdiniz.");
        }
    }
}
