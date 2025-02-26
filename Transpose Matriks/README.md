package Transpose;
```
Kode berada di folder Transpose
```
import java.util.Scanner; 
```
Mengimpor kelas Scanner dari paket java.util.
```
public class transpose { 
```
Mendeklarasikan kelas publik bernama transpose
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
        System.out.println("Masukkan jumlah baris dan kolom matriks: "); 
```
Menampilkan pesan kepada pengguna untuk memasukkan jumlah baris dan kolom matriks.
```
        int baris = input.nextInt();
```
Membaca input dari pengguna dan menyimpannya dalam variabel baris, yang menunjukkan jumlah baris matriks.
```
        int kolom = input.nextInt(); 
```
Membaca input dari pengguna dan menyimpannya dalam variabel kolom, yang menunjukkan jumlah kolom matriks.
```
        int[][] matriks = new int[baris][kolom]; 
```
Mendeklarasikan dan menginisialisasi matriks dua dimensi dengan ukuran yang ditentukan oleh baris dan kolom
```
        int[][] transpose = new int[kolom][baris]; 
```
Mendeklarasikan dan menginisialisasi matriks dua dimensi untuk menyimpan hasil transpose dengan ukuran yang dibalik (kolom menjadi baris dan sebaliknya)
```
        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:"); 
```
Menampilkan pesan kepada pengguna untuk memasukkan elemen-elemen matriks.
```
        for (int i = 0; i < baris; i++) {
```
Memulai loop untuk iterasi melalui setiap baris matriks.
```
            for (int j = 0; j < kolom; j++) {
```
Memulai loop untuk iterasi melalui setiap kolom dalam baris yang sedang diproses.
```
                matriks[i][j] = input.nextInt();
```
Mengambil input dari pengguna dan menyimpannya di elemen matriks pada posisi [i][j], yaitu baris ke-i dan kolom ke-j.
```
            }
        }
```
Menutup loop kolom dan baris.
```
        // Proses transpose
        for (int i = 0; i < baris; i++) {
```
Memulai loop untuk iterasi melalui setiap baris matrik
```
            for (int j = 0; j < kolom; j++) {
```
Memulai loop untuk iterasi melalui setiap kolom dalam baris yang sedang diproses.
```
                transpose[j][i] = matriks[i][j]; 
```
Menyimpan elemen dari matriks asli ke posisi yang sesuai di matriks transpose. Di sini, elemen pada posisi [i][j] dari matriks asli disalin ke posisi [j][i] di matriks transpose.
```
            }
        }
```
Menutup loop kolom dan baris.
```
        // Output hasil transpose
        System.out.println("Hasil transpose:");
```
Menampilkan pesan kepada pengguna bahwa hasil transpose akan ditampilkan.
```
        for (int[] row : transpose) { 
```
Memulai loop untuk iterasi melalui setiap baris dalam matriks transpose.
```
            for (int val : row) {
```
Memulai loop yang akan mengiterasi setiap elemen dalam array row. Variabel val akan menyimpan nilai dari elemen yang sedang diproses dalam setiap iterasi.
```
                System.out.print(val + " ");
```
Mencetak nilai val ke konsol, diikuti dengan spasi (" "). Ini memastikan bahwa setiap elemen dalam baris ditampilkan terpisah oleh spasi.
```
            }
            System.out.println();
```
Mencetak baris baru setelah mencetak semua elemen dalam satu baris matriks transpose.
```
        }

        input.close();
```
Menutup objek Scanner
```
    }
}