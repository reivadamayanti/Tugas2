package Transpose;
import java.util.Scanner; 

public class transpose { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        // Input ukuran matriks
        System.out.println("Masukkan jumlah baris dan kolom matriks: "); 
        int baris = input.nextInt();
        int kolom = input.nextInt(); 

        int[][] matriks = new int[baris][kolom]; 
        int[][] transpose = new int[kolom][baris]; 

        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:"); 
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = input.nextInt();
            }
        }

        // Proses transpose
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                transpose[j][i] = matriks[i][j]; 
            }
        }

        // Output hasil transpose
        System.out.println("Hasil transpose:");
        for (int[] row : transpose) { 
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        input.close();
    }
}