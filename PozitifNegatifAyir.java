import java.util.Scanner;

public class PozitifNegatifAyir {
    public static void main(String[] args) {
        // Klavyeden girilen N adet sayıyı pozitif ve negatif olarak iki ayrı diziye ayıran program.
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi eleman sayısını giriniz (N): ");
        int N = input.nextInt();
        int[] A = new int[N];
        int pozitifSayisi = 0, negatifSayisi = 0;

        // Diziyi doldur
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = input.nextInt();
            if (A[i] > 0) pozitifSayisi++;
            else if (A[i] < 0) negatifSayisi++;
        }

        int[] B = new int[pozitifSayisi]; // Pozitifler
        int[] C = new int[negatifSayisi]; // Negatifler
        int bIdx = 0, cIdx = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > 0) B[bIdx++] = A[i];
            else if (A[i] < 0) C[cIdx++] = A[i];
        }

        System.out.print("Pozitifler (B dizisi): ");
        for (int val : B) System.out.print(val + " ");
        System.out.println();
        System.out.print("Negatifler (C dizisi): ");
        for (int val : C) System.out.print(val + " ");
        System.out.println();
    }
}
