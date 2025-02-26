package diagonal;
```
Mendeklarasikan paket diagonal, yang digunakan untuk mengorganisir kelas-kelas dalam Java.
```
import java.util.Scanner;
```
Mengimpor kelas Scanner dari paket java.util untuk mengambil input dari pengguna.
```
public class diagonal {
```
Mendeklarasikan kelas publik bernama diagonal.
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main.
```
        Scanner input = new Scanner(System.in);
```
Membuat objek Scanner bernama input untuk membaca input dari pengguna.
```
Menampilkan pesan kepada pengguna untuk memasukkan ukuran matriks.
```
        // Input ukuran matriks (harus matriks persegi)
        System.out.print("Masukkan ukuran matriks (n x n): ");
```
Menampilkan pesan kepada pengguna untuk memasukkan ukuran matriks.
```
        int n = input.nextInt();
```
Membaca input dari pengguna dan menyimpannya dalam variabel n, yang menunjukkan ukuran matriks (jumlah baris dan kolom).
```
        int[][] matriks = new int[n][n];
```
Mendeklarasikan dan menginisialisasi matriks dua dimensi dengan ukuran n x n
```
        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:");
```
Menampilkan pesan kepada pengguna untuk memasukkan elemen-elemen matriks.
```
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                matriks[i][j] = input.nextInt();
```
Menggunakan dua loop bersarang untuk mengisi elemen matriks. Loop pertama (i) untuk baris dan loop kedua (j) untuk kolom. Setiap elemen matriks diisi dengan input dari pengguna.
java
```
        // Cetak diagonal utama & diagonal samping
        System.out.print("Diagonal utama: ");
```
Menampilkan pesan untuk menunjukkan bahwa diagonal utama akan dicetak.
```
        for (int i = 0; i < n; i++) 
            System.out.print(matriks[i][i] + " ");
```
Menggunakan loop untuk mencetak elemen diagonal utama, yaitu elemen yang terletak pada posisi [i][i] (baris dan kolom yang sama).
```
        System.out.print("\nDiagonal samping: ");
```
Menampilkan pesan untuk menunjukkan bahwa diagonal samping akan dicetak. \n digunakan untuk membuat baris baru.
```
        for (int i = 0; i < n; i++) 
            System.out.print(matriks[i][n - i - 1] + " ");
```
Menggunakan loop untuk mencetak elemen diagonal samping, yaitu elemen yang terletak pada posisi [i][n - i - 1], yang merupakan elemen dari kolom yang berlawanan dengan baris.
```
        input.close();
```
Menutup objek Scanner untuk mencegah kebocoran memori setelah selesai mengambil input dari pengguna.
``` 
    }
}
