``` PENJELASAN KODE LATIHAN 1```
public class LatihanArray1 {
```
Mendeklarasikan sebuah kelas publik bernama LatihanArray1. Kelas ini adalah tempat di mana program akan dieksekusi.
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main, yang merupakan titik masuk (entry point) untuk program Java. Metode ini akan dieksekusi saat program dijalankan.
```
        // Buat program untuk:
        // 1. Membuat array dengan 10 bilangan bulat
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        // 3. Menampilkan isi array
        // 4. Menghitung jumlah semua elemen array
```
Komentar yang menjelaskan tujuan dari program ini.
```
        int[] bilanganGenap = new int[10];
```
Mendeklarasikan dan menginisialisasi sebuah array integer bernama bilanganGenap dengan ukuran 10. Array ini akan digunakan untuk menyimpan 10 bilangan bulat.
```
        int jumlah = 0;
```
Mendeklarasikan variabel jumlah dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menyimpan total jumlah dari semua elemen dalam array.
```
        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }
```
Menggunakan loop for untuk mengisi array bilanganGenap.
bilanganGenap.length memberikan panjang array (10).
Dalam setiap iterasi, elemen array diindeks i diisi dengan bilangan genap, yang dihitung dengan rumus (i + 1) * 2. Ini menghasilkan bilangan genap mulai dari 2 hingga 20.
```
        // Menampilkan array
        System.out.println("Isi array:");
```
Mencetak string "Isi array:" ke konsol untuk memberi tahu pengguna bahwa program akan menampilkan isi array.
```
        for (int bilangan : bilanganGenap) {
```
Menggunakan loop for-each untuk iterasi melalui setiap elemen dalam array bilanganGenap. Setiap elemen akan disimpan dalam variabel bilangan.
```
            System.out.print(bilangan + " ");
```
Mencetak setiap bilangan genap yang ada dalam array, diikuti dengan spasi. Ini akan menampilkan semua elemen dalam satu baris.
```
            jumlah += bilangan;
```
Menambahkan nilai bilangan ke variabel jumlah. Ini akan menghitung total dari semua elemen dalam array.
```
        }
```
Menandakan akhir dari loop for-each.
```
        System.out.println("\nJumlah semua elemen: " + jumlah);
```
Mencetak jumlah total dari semua elemen dalam array. \n untuk mencetak baris baru.
```
    }
}

``` PENJELASAN KODE LATIHAN 2```
public class PencarianArray {
```
Mendeklarasikan sebuah kelas publik bernama PencarianArray
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main. Metode ini akan dieksekusi saat program dijalankan.
```
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
```
Mendeklarasikan dan menginisialisasi sebuah array integer bernama nilai dengan beberapa nilai: 75, 80, 65, 90, 85, 70, 95, dan 88.
```
        int cari = 90;
```
Mendeklarasikan variabel cari dan menginisialisasinya dengan nilai 90. Variabel ini menyimpan nilai yang akan dicari dalam array.
```
        boolean ketemu = false;
```
Mendeklarasikan variabel boolean ketemu dan menginisialisasinya dengan false. Variabel ini akan digunakan untuk menandakan apakah nilai yang dicari ditemukan dalam array.
```
        int indeks = -1;
```
Mendeklarasikan variabel indeks dan menginisialisasinya dengan -1. Variabel ini akan menyimpan indeks dari nilai yang ditemukan, jika ada. Nilai -1 menunjukkan bahwa nilai tersebut belum ditemukan.
```
        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap elemen dalam array nilai. Loop ini akan berjalan dari indeks 0 hingga panjang array (nilai.length).
```
            if (nilai[i] == cari) {
```
Memeriksa apakah elemen array pada indeks i sama dengan nilai yang dicari (cari). Jika ya, maka blok kode di dalam if akan dieksekusi.
```
                ketemu = true;
```
Jika nilai ditemukan, variabel ketemu diubah menjadi true, menandakan bahwa pencarian berhasil.
```
                indeks = i;
```
Menyimpan indeks dari elemen yang ditemukan ke dalam variabel indeks.
                break;
```
Menghentikan loop for setelah menemukan nilai yang dicari.
            }
```
Menandakan akhir dari blok if.
```
        }
```
Menandakan akhir dari loop for.
```
        // Menampilkan hasil
        if (ketemu) {
```
Memeriksa apakah variabel ketemu bernilai true. Jika ya, maka blok kode di dalam if akan dieksekusi.
```
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
```
Mencetak pesan ke konsol yang menyatakan bahwa nilai yang dicari ditemukan, beserta indeksnya.
```
        } else {
```
Jika ketemu bernilai false, maka blok kode di dalam else akan dieksekusi.
            System.out.println("Nilai " + cari + " tidak ditemukan");
```
Mencetak pesan ke konsol yang menyatakan bahwa nilai yang dicari tidak ditemukan dalam array.
```
        }
    }
```
Menandakan akhir dari metode main dan kelas PencarianArray.
```
}
```


``` PENJELASAN KODE LATIHAN 3 ```
public class StatistikArray {
```
Mendeklarasikan sebuah kelas publik bernama StatistikArray.
```
    public static void main(String[] args) {
```
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
```
Mendeklarasikan dan menginisialisasi sebuah array integer bernama nilai dengan beberapa nilai: 75, 80, 65, 90, 85, 70, 95, dan 88.
```
        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
```
Mendeklarasikan variabel tertinggi dan menginisialisasinya dengan nilai pertama dari array nilai (75). Ini akan digunakan untuk menyimpan nilai tertinggi yang ditemukan.
```
        int terendah = nilai[0];
```
Mendeklarasikan variabel terendah dan menginisialisasinya dengan nilai pertama dari array nilai (75). Ini akan digunakan untuk menyimpan nilai terendah yang ditemukan.
```
        int total = nilai[0];
```
Mendeklarasikan variabel total dan menginisialisasinya dengan nilai pertama dari array nilai (75). Ini akan digunakan untuk menghitung total dari semua nilai.
```
        for (int i = 1; i < nilai.length; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap elemen dalam array nilai, dimulai dari indeks 1 (elemen kedua) hingga panjang array (nilai.length). Indeks 0 sudah digunakan untuk inisialisasi tertinggi, terendah, dan total.
```
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
```
Memeriksa apakah elemen array pada indeks i lebih besar dari tertinggi. Jika ya, maka tertinggi diupdate dengan nilai tersebut. Ini akan mencari nilai tertinggi dalam array.
```
            if (nilai[i] < terendah) terendah = nilai[i];
```
Memeriksa apakah elemen array pada indeks i lebih kecil dari terendah. Jika ya, maka terendah diupdate dengan nilai tersebut. Ini akan mencari nilai terendah dalam array.
```
            total += nilai[i];
```
Menambahkan nilai elemen array pada indeks i ke dalam variabel total. Ini akan menghitung total dari semua nilai dalam array.
```
        }
```
Menandakan akhir dari loop for.
```
        double rataRata = (double) total / nilai.length;
```
Menghitung rata-rata nilai dengan membagi total dengan jumlah elemen dalam array (nilai.length). Hasilnya di-casting menjadi double untuk memastikan hasilnya adalah angka desimal.
```
        System.out.println("Nilai tertinggi: " + tertinggi);
```
Mencetak nilai tertinggi yang ditemukan ke konsol.
```
        System.out.println("Nilai terendah: " + terendah);
```
Mencetak nilai terendah yang ditemukan ke konsol.
```
        System.out.println("Rata-rata: " + rataRata);
```
Mencetak rata-rata nilai yang dihitung ke konsol.
```
    }
}
```
Menandakan akhir dari metode main dan kelas StatistikArray.
```

``` PENJELASAN KODE LATIHAN 4 ```

public class OperasiMatriks {
```
Mendeklarasikan sebuah kelas publik bernama OperasiMatriks.
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main, yang merupakan titik masuk (entry point) untuk program Java. Metode ini akan dieksekusi saat program dijalankan.
```
        // Program operasi matriks
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };
```
Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bernama matriksA dengan dua baris dan tiga kolom. Matriks ini berisi nilai:
Baris 1: 1, 2, 3
Baris 2: 4, 5, 6
```
        int[][] matriksB = {
            {7, 8, 9},
            {10, 11, 12}
        };
```
Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bernama matriksB dengan dua baris dan tiga kolom. Matriks ini berisi nilai:
Baris 1: 7, 8, 9
Baris 2: 10, 11, 12
```
        // Penjumlahan matriks
        int[][] hasil = new int[2][3];
```
Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bernama hasil dengan ukuran 2x3. Matriks ini akan digunakan untuk menyimpan hasil penjumlahan dari matriksA dan matriksB.
```
        for (int i = 0; i < matriksA.length; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap baris dalam matriksA. matriksA.length memberikan jumlah baris dalam matriks (2)
```
            for (int j = 0; j < matriksA[0].length; j++) {
```
Menggunakan loop for yang bersarang untuk iterasi melalui setiap kolom dalam baris i dari matriksA. matriksA[0].length memberikan jumlah kolom dalam matriks (3).
```
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
```
Menjumlahkan elemen dari matriksA dan matriksB pada posisi yang sama (indeks [i][j]) dan menyimpan hasilnya ke dalam matriks hasil pada posisi yang sama.
```
            }
```
Menandakan akhir dari loop for yang bersarang (kolom).
```
        }
```
Menandakan akhir dari loop for (baris).
```
        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:");
```
Mencetak string "Hasil penjumlahan matriks:" ke konsol untuk memberi tahu pengguna bahwa program akan menampilkan hasil penjumlahan matriks.
```
        for (int[] baris : hasil) {
```
Menggunakan loop for-each untuk iterasi melalui setiap baris dalam matriks hasil. Setiap baris akan disimpan dalam variabel baris.
```          
            for (int nilai : baris) {
```
Menggunakan loop for-each yang bersarang untuk iterasi melalui setiap elemen dalam baris. Setiap elemen akan disimpan dalam variabel nilai.
```
                System.out.print(nilai + " ");
```
Mencetak setiap nilai dalam baris, diikuti dengan spasi.
```
            }
Menandakan akhir dari loop for-each (elemen dalam baris).
```
            System.out.println();
```
Mencetak baris baru setelah mencetak semua elemen
```
        }
    }
}
```

``` PENJELASAN STUDY KASUS 1 ```
public class SistemNilai {
```
Mendeklarasikan sebuah kelas publik bernama SistemNilai. 
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main, yang merupakan titik masuk (entry point) untuk program Java. Metode ini akan dieksekusi saat program dijalankan.
```
      // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
```
Mendeklarasikan dan menginisialisasi sebuah array string bernama namaSiswa yang berisi nama-nama siswa: Ani, Budi, Cici, Dodi, dan Edi.
```
        int[][] nilai = {
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
        };
```
Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bernama nilai yang menyimpan nilai-nilai siswa. Setiap baris mewakili nilai dari masing-masing siswa untuk tiga mata pelajaran:
Baris 1: Nilai Ani (80, 85, 90)
Baris 2: Nilai Budi (75, 70, 85)
Baris 3: Nilai Cici (85, 80, 88)
Baris 4: Nilai Dodi (90, 85, 95)
Baris 5: Nilai Edi (70, 75, 80)
```
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
```
Mendeklarasikan dan menginisialisasi sebuah array string bernama mapel yang berisi nama-nama mata pelajaran: Matematika, Bahasa Inggris, dan IPA.
```
        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:");
```
Mencetak string "Rata-rata nilai per siswa:" ke konsol untuk memberi tahu pengguna bahwa program akan menampilkan rata-rata nilai per siswa.
```
        for (int i = 0; i < nilai.length; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap siswa (baris dalam array nilai). nilai.length memberikan jumlah siswa (5).
```
            double total = 0;
```
Mendeklarasikan variabel total dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menghitung total nilai siswa saat ini.
```
            for (int n : nilai[i]) {
```
Menggunakan loop for-each untuk iterasi melalui setiap nilai dalam baris i dari array nilai. Setiap nilai akan disimpan dalam variabel n.
```
                total += n;
```
Menambahkan nilai n ke dalam variabel total. Ini akan menghitung total nilai untuk siswa saat ini.
```
            }
```
Menandakan akhir dari loop for-each (nilai dalam baris).
```
            double rataSiswa = total / nilai[i].length;
```
Menghitung rata-rata nilai untuk siswa saat ini dengan membagi total dengan jumlah nilai yang dimiliki siswa (jumlah kolom dalam baris i).
```
            System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa);
```
Mencetak nama siswa dan rata-rata nilai mereka ke konsol dengan format dua desimal. %s digunakan untuk mencetak string (nama siswa), dan %.2f digunakan untuk mencetak angka desimal (rata-rata) dengan dua angka di belakang koma.
```
        }
```
Menandakan akhir dari loop for (siswa).
```
        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:");
```
Mencetak string "Rata-rata nilai per mata pelajaran:" ke konsol.
```
        for (int j = 0; j < nilai[0].length; j++) {
```
Menggunakan loop for untuk iterasi melalui setiap mata pelajaran (kolom dalam array nilai). nilai[0].length memberikan jumlah kolom dalam matriks nilai, yang mewakili jumlah mata pelajaran (3).
```
            double total = 0;
```
Mendeklarasikan variabel total dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menghitung total nilai untuk mata pelajaran saat ini.
```
            for (int i = 0; i < nilai.length; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap siswa (baris dalam array nilai). nilai.length memberikan jumlah siswa (5).
```
                total += nilai[i][j];
```
Menambahkan nilai untuk mata pelajaran saat ini (indeks [i][j], di mana i adalah indeks siswa dan j adalah indeks mata pelajaran) ke dalam variabel total. Ini akan menghitung total nilai untuk mata pelajaran saat ini.
```
            }
```
Menandakan akhir dari loop for (siswa).
```
            double rataMapel = total / nilai.length;
```
Menghitung rata-rata nilai untuk mata pelajaran saat ini dengan membagi total dengan jumlah siswa (nilai.length). Ini memberikan rata-rata nilai untuk mata pelajaran yang sedang diproses.
```
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);
```
Mencetak nama mata pelajaran dan rata-rata nilai mereka ke konsol dengan format dua desimal. %s digunakan untuk mencetak string (nama mata pelajaran), dan %.2f digunakan untuk mencetak angka desimal (rata-rata) dengan dua angka di belakang koma. 
```
        }
```
Menandakan akhir dari loop for (mata pelajaran).
```
    }
```
Menandakan akhir dari metode main dan kelas SistemNilai.
}
```

``` PENJELASAN STUDY KASUS 2 ```
public class TicTacToe {
```
Mendeklarasikan sebuah kelas publik bernama TicTacToe.
```
    public static void main(String[] args) {
```
Mendeklarasikan metode main, yang merupakan titik masuk (entry point) untuk program Java. Metode ini akan dieksekusi saat program dijalankan.
```
        char[][] papan = new char[3][3];
```
Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bernama papan yang berisi karakter. Array ini memiliki ukuran 3x3, yang akan digunakan untuk merepresentasikan papan permainan Tic Tac Toe.
```
        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap baris dalam papan. Loop ini akan berjalan dari 0 hingga 2 (total 3 iterasi).
```
            for (int j = 0; j < 3; j++) {
```
Menggunakan loop for yang bersarang untuk iterasi melalui setiap kolom dalam baris i. Loop ini juga akan berjalan dari 0 hingga 2.
```
                papan[i][j] = '-';
```
Menginisialisasi setiap elemen dalam array papan dengan karakter '-', yang menunjukkan bahwa posisi tersebut kosong.
```
            }
```
Menandakan akhir dari loop for (kolom).
```
        }
```
Menandakan akhir dari loop for (baris).
```
        // Simulasi beberapa langkah
        papan[0][0] = 'X';
```
Menetapkan karakter 'X' pada posisi (0, 0) di papan, yang menunjukkan bahwa pemain X telah mengambil posisi tersebut.
```
        papan[1][1] = 'O';
```
Menetapkan karakter 'O' pada posisi (1, 1) di papan, yang menunjukkan bahwa pemain O telah mengambil posisi tersebut.
```
        papan[2][2] = 'X';
```
Menetapkan karakter 'X' pada posisi (2, 2) di papan, yang menunjukkan bahwa pemain X telah mengambil posisi tersebut.
```
        // Tampilkan papan
        System.out.println("Status Papan:");
```
Mencetak string "Status Papan:" ke konsol untuk memberi tahu pengguna bahwa program akan menampilkan status papan permainan.
```
        tampilkanPapan(papan);
```
Memanggil metode tampilkanPapan dan mengoper array papan sebagai argumen. Metode ini akan digunakan untuk menampilkan status papan permainan ke konsol.
```
    }
```
Menandakan akhir dari metode main.
```
    public static void tampilkanPapan(char[][] papan) {
```
Mendeklarasikan metode publik dan statis bernama tampilkanPapan yang menerima parameter berupa array dua dimensi papan bertipe karakter. Metode ini akan digunakan untuk menampilkan status papan permainan.
```
        for (int i = 0; i < 3; i++) {
```
Menggunakan loop for untuk iterasi melalui setiap baris dalam papan. Loop ini akan berjalan dari 0 hingga 2.
```
         for (int j = 0; j < 3; j++) {
```
Menggunakan loop for yang bersarang untuk iterasi melalui setiap kolom dalam baris i. Loop ini juga akan berjalan dari 0 hingga 2.
```
                System.out.print(papan[i][j] + " ");
```
Mencetak elemen pada posisi (i, j) dari array papan di konsol, diikuti dengan spasi. Ini akan menampilkan status setiap posisi di papan.
```
            }
Menandakan akhir dari loop for (kolom).
```
            System.out.println();
```
Mencetak baris baru setelah mencetak semua elemen dalam satu baris, sehingga setiap baris papan akan ditampilkan di baris baru di konsol.
```
        }
    }
}
