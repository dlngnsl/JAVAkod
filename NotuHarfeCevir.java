import java.util.Scanner;

public class NotuHarfeCevir {
    public static void main(String[] args) {
        // Klavyeden girilen bir öğrencinin notunu harf notuna çeviren program.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrencinin notunu giriniz (0-100): ");
        int not = scanner.nextInt();
        scanner.close();

        char harf;
        if (not >= 90 && not <= 100) {
            harf = 'A';
        } else if (not >= 80) {
            harf = 'B';
        } else if (not >= 70) {
            harf = 'C';
        } else if (not >= 60) {
            harf = 'D';
        } else {
            harf = 'F';
        }

        System.out.println("Notun harf karşılığı: " + harf);
    }
}
