package TUGAS2MATRIKS;
```
Mendeklarasikan TUGAS2MATRIKS berarti membuat grup atau folder untuk mengorganisir kelas-kelas yang berkaitan dengan tugas matriks dalam program Java.
```
import java.util.Scanner;
```
Mengimpor kelas Scanner dari paket java.util, yang digunakan untuk mengambil input dari pengguna 
```
public class perkalian_matriks {
```
Mendeklarasikan kelas publik bernama perkalian_matriks.
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main
```
        Scanner input = new Scanner(System.in);
```
Membuat objek Scanner bernama input untuk membaca input dari pengguna
```
        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks A: ");
```
Menampilkan pesan kepada pengguna untuk memasukkan jumlah baris matriks A.
```
        int barisA = input.nextInt();
```
Membaca input dari pengguna dan menyimpannya dalam variabel barisA
```
        System.out.print("Masukkan jumlah kolom matriks A (sama dengan baris B): ");
```
Menampilkan pesan kepada pengguna untuk memasukkan jumlah kolom matriks A, yang harus sama dengan jumlah baris matriks B.
```
        int kolomA = input.nextInt();
```
Membaca input dari pengguna dan menyimpannya dalam variabel kolomA
```
        System.out.print("Masukkan jumlah kolom matriks B: ");
```
Menampilkan pesan kepada pengguna untuk memasukkan jumlah kolom matriks B.
```
        int kolomB = input.nextInt();
```
Membaca input dari pengguna dan menyimpannya dalam variabel kolomB.
```
        // Deklarasi dan input elemen matriks A
        int[][] A = new int[barisA][kolomA];
```
Mendeklarasikan dan menginisialisasi matriks A dengan ukuran yang ditentukan oleh barisA dan kolomA.
```
        System.out.println("Masukkan elemen matriks A:");
```
Menampilkan pesan kepada pengguna untuk memasukkan elemen-elemen matriks A.
```
        inputMatriks(A, barisA, kolomA, input);
```
Memanggil fungsi inputMatriks untuk mengisi elemen-elemen matriks A dengan input dari pengguna.
```
        // Deklarasi dan input elemen matriks B
        int[][] B = new int[kolomA][kolomB];
```
Mendeklarasikan dan menginisialisasi matriks B dengan ukuran yang ditentukan oleh kolomA dan kolomB.
```
        System.out.println("Masukkan elemen matriks B:");
```
Menampilkan pesan kepada pengguna untuk memasukkan elemen-elemen matriks B.
```
        inputMatriks(B, kolomA, kolomB, input);
```
Memanggil fungsi inputMatriks untuk mengisi elemen-elemen matriks B dengan input dari pengguna.
```
        // Perkalian matriks
        int[][] C = new int[barisA][kolomB];
```
Mendeklarasikan dan menginisialisasi matriks C untuk menyimpan hasil perkalian matriks A dan B.
```
        perkalianMatriks(A, B, C, barisA, kolomA, kolomB);
```
Memanggil fungsi perkalianMatriks untuk melakukan operasi perkalian antara matriks A dan B, hasilnya disimpan di matriks C.
```
        // Output hasil perkalian
        System.out.println("Hasil perkalian matriks:");
```
Menampilkan pesan hasil perkalian matriks.
```
        printMatriks(C, barisA, kolomB);
```
Memanggil fungsi printMatriks untuk mencetak matriks hasil perkalian (matriks C). Parameter yang diberikan adalah matriks C, jumlah baris barisA, dan jumlah kolom kolomB.
```
Menutup objek Scanner yang digunakan untuk mengambil input dari pengguna.
```
        input.close();
```
Menutup objek Scanner.
```
    }

    // Fungsi untuk input matriks
    private static void inputMatriks(int[][] matriks, int baris, int kolom, Scanner input) {
```
Mendeklarasikan fungsi inputMatriks yang bersifat privat dan statis. Fungsi ini digunakan untuk mengisi elemen-elemen matriks. Ia menerima tiga parameter: matriks yang akan diisi, jumlah baris, jumlah kolom, dan objek Scanner untuk input.
```
        for (int i = 0; i < baris; i++) {
```
Memulai loop untuk iterasi melalui setiap baris matriks. Variabel i digunakan untuk menunjukkan indeks baris saat ini.
```
            for (int j = 0; j < kolom; j++) {
```
Memulai loop untuk iterasi melalui setiap kolom dalam baris yang sedang diproses. Variabel j digunakan untuk menunjukkan indeks kolom saat ini.
```
                matriks[i][j] = input.nextInt();
```
Mengambil input dari pengguna dan menyimpannya di elemen matriks pada posisi [i][j], yaitu baris ke-i dan kolom ke-j.
```
            }
        }
    }

    // Fungsi untuk perkalian matriks
```
    private static void perkalianMatriks(int[][] A, int[][] B, int[][] C, int barisA, int kolomA, int kolomB) {
```
Mendeklarasikan fungsi perkalianMatriks yang bersifat privat dan statis. Fungsi ini digunakan untuk melakukan perkalian antara dua matriks (A dan B) dan menyimpan hasilnya di matriks C. Ia menerima tiga matriks dan ukuran baris dan kolom yang diperlukan untuk melakukan perkalian.
```
        for (int i = 0; i < barisA; i++) {
```
Memulai loop untuk iterasi melalui setiap baris matriks A. Variabel i menunjukkan indeks baris saat ini.
```
            for (int j = 0; j < kolomB; j++) {
```
Memulai loop untuk iterasi melalui setiap kolom matriks B. Variabel j menunjukkan indeks kolom saat ini
```
                for (int k = 0; k < kolomA; k++) {
```
Memulai loop untuk iterasi melalui setiap elemen dalam baris matriks A dan kolom matriks B yang sesuai. Variabel k digunakan untuk menunjukkan indeks elemen yang sedang diproses.
```
                    C[i][j] += A[i][k] * B[k][j];
```
Melakukan perkalian elemen dari matriks A dan B, kemudian menjumlahkan hasilnya ke elemen yang sesuai di matriks C pada posisi [i][j]. Ini adalah langkah inti dari perkalian matriks.
```
                }
            }
        }
    }
```
    // Fungsi untuk mencetak matriks
    private static void printMatriks(int[][] matriks, int baris, int kolom) {
```
Mendeklarasikan fungsi printMatriks yang bersifat privat dan statis. Fungsi ini digunakan untuk mencetak elemen-elemen dari matriks ke konsol. Ia menerima matriks yang akan dicetak, serta jumlah baris dan kolom.
```
        for (int i = 0; i < baris; i++) {
```
Memulai loop yang akan mengulangi proses untuk setiap baris dalam matriks. Variabel i digunakan sebagai indeks untuk menunjukkan baris yang sedang diproses. Loop ini akan berjalan dari 0 hingga jumlah baris yang ditentukan (variabel baris).
```
            for (int j = 0; j < kolom; j++) {
```
Memulai loop yang akan mengulangi proses untuk setiap kolom dalam baris yang sedang diproses. Variabel j digunakan sebagai indeks untuk menunjukkan kolom yang sedang diproses. Loop ini akan berjalan dari 0 hingga jumlah kolom yang ditentukan (variabel kolom).
```
                System.out.print(matriks[i][j] + " ");
```
Mencetak elemen matriks pada posisi [i][j], yaitu elemen yang terletak di baris ke-i dan kolom ke-j. Setelah mencetak elemen, ditambahkan spasi (" ") agar elemen-elemen yang dicetak terpisah satu sama lain di konsol.
```
            }
            System.out.println();
```
Mencetak baris baru setelah mencetak semua elemen dalam satu baris matriks. Ini memastikan bahwa setiap baris matriks akan ditampilkan di baris yang terpisah di konsol, sehingga hasilnya lebih teratur dan mudah dibaca.
```
        }
    }
}