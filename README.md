# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi manajemen studio foto menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pelanggan, nomor HP, e-mail, jenis paket layanan, dan tanggal sesi, dan memberikan output berupa informasi detail dari pemesanan tersebut seperti nama pelanggan, detail paket (indoor/outdoor), estimasi total biaya termasuk biaya transportasi, dan tanggal pelaksanaan sesi foto.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pelanggan`, `PemesananFoto`, `PaketLayanan`, `PaketIndoor`, `PaketOutdoor`, dan `MainPayungTeduh` adalah contoh dari class.

```bash
public class Pelanggan {
    ...
}

public class PemesananFoto {
    ...
}

public abstract class PaketLayanan {
    ...
}

public class PaketIndoor extends PaketLayanan {
    ...
}

public class PaketOutdoor extends PaketLayanan {
    ...
}

public class MainPayungTeduh {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `new PaketIndoor("Minimalist Potrait", 350000)`, `new PaketIndoor("Corporate Professional", 500000)`, `new PaketIndoor("Graduation Story", 600000)`, `new PaketOutdoor("Family Warmth", 1350000, 150000)`, `new PaketOutdoor("Eternal Love (Pre-Wedding)", 5000000, 200000)`, `static Scanner sc = new Scanner(System.in);`, `Pelanggan pelangganBaru = new Pelanggan(nama, noHp, email);`, `PemesananFoto pesananBaru = new PemesananFoto(pelangganBaru, paketTerpilih, tanggal);` adalah contoh pembuatan object.

```bash
new PaketIndoor("Minimalist Potrait", 350000)

new PaketIndoor("Corporate Professional", 500000)

new PaketIndoor("Graduation Story", 600000)

new PaketOutdoor("Family Warmth", 1350000, 150000)

new PaketOutdoor("Eternal Love (Pre-Wedding)", 5000000, 200000)

static Scanner sc = new Scanner(System.in);

Pelanggan pelangganBaru = new Pelanggan(nama, noHp, email);

PemesananFoto pesananBaru = new PemesananFoto(pelangganBaru, paketTerpilih, tanggal);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `noHp`, `email`, `pelanggan`, `paketDipilih`, `tanggalSesi`, `namaPaket`, `hargaPaket`, dan  `biayaTransportasi` adalah contoh atribut.

```bash
String nama;
String noHp;
String email;
Pelanggan pelanggan;
PaketLayanan paketDipilih;
String tanggalSesi;
String namaPaket;
double hargaPaket;
double biayaTransportasi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pelanggan`, `PemesananFoto`, `PaketLayanan`, `PaketIndoor`, dan `PaketOutdoor`.

```bash
public Pelanggan(String nama, String noHp, String email) {
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
}

public PemesananFoto(Pelanggan pelanggan, PaketLayanan paketDipilih, String tanggalSesi) {
        this.pelanggan = pelanggan;
        this.paketDipilih = paketDipilih;
        this.tanggalSesi = tanggalSesi;
}

public PaketLayanan(String namaPaket, double hargaPaket) {
        this.namaPaket = namaPaket;
        this.hargaPaket = hargaPaket;
}

public PaketIndoor(String namaPaket, double hargaPaket) {
        super(namaPaket, hargaPaket);
}

public PaketOutdoor(String namaPaket, double hargaPaket, double biayaTransportasi) {
        super(namaPaket, hargaPaket);
        this.biayaTransportasi = biayaTransportasi;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setNoHp`, `setEmail`, `setPaketDipilih`, `setTanggalSesi`, `setNamaPaket`, `setHargaPaket`, dan `setBiayaTransportasi` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setNoHp(String noHp) {
        this.noHp = noHp;
}

public void setEmail(String email) {
        this.email = email;
}

public void setPaketDipilih(PaketLayanan paketDipilih) {
        this.paketDipilih = paketDipilih;
}

public void setTanggalSesi(String tanggalSesi) {
        this.tanggalSesi = tanggalSesi;
}

public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
}

public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
}

public void setBiayaTransportasi(double biayaTransportasi) {
        this.biayaTransportasi = biayaTransportasi;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNoHp`, `getEmail`, `getPelanggan`, `getPaketDipilih`, `getTanggalSesi`, `getNamaPaket`, `getHargaPaket`, dan `getNoBiayaTransportasi` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
}

public String getNoHp() {
        return noHp;
}

public String getEmail() {
        return email;
}

public Pelanggan getPelanggan() {
        return pelanggan;
}

public PaketLayanan getPaketDipilih() {
        return paketDipilih;
}

public String getTanggalSesi() {
        return tanggalSesi;
}

public String getNamaPaket() {
        return namaPaket;
}

public double getHargaPaket() {
        return hargaPaket;
}

public double getBiayaTransportasi() {
        return biayaTransportasi;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `noHp`, `email`, `pelanggan`, `paketDipilih`, `tanggalSesi`, `namaPaket`, `hargaPaket`, dan `biayaTransportasi` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String noHp;
private String email;
private Pelanggan pelanggan;
private PaketLayanan paketDipilih;
private String tanggalSesi;
private String namaPaket;
private double hargaPaket;
private double biayaTransportasi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PaketIndoor` dan `PaketOutdoor` mewarisi `PaketLayanan` dengan sintaks `extends`.

```bash
public class PaketIndoor extends PaketLayanan {
    ...
}

public class PaketOutdoor extends PaketLayanan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `hitungTotal()` di `PaketLayanan`, `PaketIndoor`, dan `PaketOutdoor` merupakan override dari method `hitungTotal` di `PaketLayanan`, `PaketIndoor`, dan `PaketOutdoor`.

```bash
public abstract class PaketLayanan {
    public abstract double hitungTotal();
}

@Override
public double hitungTotal() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch-case` dalam method `main`.

```bash
switch (pilihan) {
                case 1:
                    lihatPaket();
                    break;
                case 2:
                    pesanSesi();
                    break;
                case 3:
                    tampilkanRiwayat();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("\nTerima kasih telah menggunakan layanan Studio Payung Teduh!");
                    System.out.println("Sampai jumpa di sesi pemotretan berikutnya :)");
                    break;
                default:
                    System.out.println(">> Menu tidak tersedia. Silakan pilih 1-4.\n");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
while (lanjut) {
            tampilkanMenu();

            int pilihan = -1;
            //ERROR HANDLING
            try {
                System.out.print("Pilih menu (1-4): ");
                String input = sc.nextLine();
                pilihan = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(">> Input harus berupa angka!\n");
                continue;
            }

            //SELEKSI
            switch (pilihan) {
                case 1:
                    lihatPaket();
                    break;
                case 2:
                    pesanSesi();
                    break;
                case 3:
                    tampilkanRiwayat();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("\nTerima kasih telah menggunakan layanan Studio Payung Teduh!");
                    System.out.println("Sampai jumpa di sesi pemotretan berikutnya :)");
                    break;
                default:
                    System.out.println(">> Menu tidak tersedia. Silakan pilih 1-4.\n");
            }
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan untuk menjalankan program.

```bash
import java.util.Scanner;

static Scanner sc = new Scanner(System.in);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `static PemesananFoto[] antrean = new PemesananFoto[20];` dan `antrean[jumlahAntrean] = pesananBaru;` adalah contoh penggunaan array.

```bash
static PemesananFoto[] antrean = new PemesananFoto[20];
antrean[jumlahAntrean] = pesananBaru;
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    System.out.print("Pilih menu (1-4): ");
    String input = sc.nextLine();
    pilihan = Integer.parseInt(input);
} catch (NumberFormatException e) {
    System.out.println(">> Input harus berupa angka!\n");
    continue;
}

try {
    System.out.print("Pilih nomor paket: ");
    pilihPaket = Integer.parseInt(sc.nextLine());
} catch (NumberFormatException e) {
    System.out.println(">> Input harus berupa angka! Pemesanan dibatalkan.\n");
    return;
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat
**Nama:** Zahratunnisa  
**NPM:** 2410010299 
