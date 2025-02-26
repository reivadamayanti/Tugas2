package TUGAS2MATRIKS;
import java.util.Scanner;
public class perkalian_matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks A: ");
        int barisA = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A (sama dengan baris B): ");
        int kolomA = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int kolomB = input.nextInt();

        // Deklarasi dan input elemen matriks A
        int[][] A = new int[barisA][kolomA];
        System.out.println("Masukkan elemen matriks A:");
        inputMatriks(A, barisA, kolomA, input);

        // Deklarasi dan input elemen matriks B
        int[][] B = new int[kolomA][kolomB];
        System.out.println("Masukkan elemen matriks B:");
        inputMatriks(B, kolomA, kolomB, input);

        // Perkalian matriks
        int[][] C = new int[barisA][kolomB];
        perkalianMatriks(A, B, C, barisA, kolomA, kolomB);

        // Output hasil perkalian
        System.out.println("Hasil perkalian matriks:");
        printMatriks(C, barisA, kolomB);

        input.close();
    }

    // Fungsi untuk input matriks
    private static void inputMatriks(int[][] matriks, int baris, int kolom, Scanner input) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk perkalian matriks
    private static void perkalianMatriks(int[][] A, int[][] B, int[][] C, int barisA, int kolomA, int kolomB) {
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    // Fungsi untuk mencetak matriks
    private static void printMatriks(int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}