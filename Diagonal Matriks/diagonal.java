package diagonal;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ukuran matriks (harus matriks persegi)
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = input.nextInt();

        int[][] matriks = new int[n][n];

        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                matriks[i][j] = input.nextInt();

        // Cetak diagonal utama & diagonal samping
        System.out.print("Diagonal utama: ");
        for (int i = 0; i < n; i++) 
            System.out.print(matriks[i][i] + " ");

        System.out.print("\nDiagonal samping: ");
        for (int i = 0; i < n; i++) 
            System.out.print(matriks[i][n - i - 1] + " ");

        input.close(); 
    }
}
