# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pelanggan`, `Ongkir`, dan `DataPelanggan` adalah contoh dari class.

```bash
public class Pelanggan {
    ...
}

public class Ongkir extends Pelanggan {
    ...
}

public class DataPelanggan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Pelanggan pelanggan = new OngkirPelanggan(nama, alamat, noHp, jumlahPesanan, wilayah);
` adalah contoh pembuatan object.

```bash
Pelanggan pelanggan = new OngkirPelanggan(nama, alamat, noHp, jumlahPesanan, wilayah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`alamat`,`noHp`,`jumlahPesanan`,`wilayah` dan `ongkir` adalah contoh atribut.

```bash
- Di Pelanggan
String nama;
String alamat;
String noHp;
String jumlah Pesanan;

- Di Ongkir:
String wilayah;
String ongkir;

```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pelanggan` dan `Ongkir`.

```bash
   public Pelanggan(String nama, String alamat, String noHp, int jumlahPesanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.jumlahPesanan = jumlahPesanan;
    }
    public Ongkir(String nama, String alamat, String noHp, int jumlahPesanan, String wilayah) {
        super(nama, alamat, noHp, jumlahPesanan);
        this.wilayah = wilayah;
        this.ongkir = hitungOngkir(wilayah);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setalamat` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setJumlahPesanan(int jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getAlamat`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
  public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public int getJumlahPesanan() {
        return jumlahPesanan;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `hitungOngkir` dienkapsulasi.

```bash
private int hitungOngkir(String wilayah) {
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Ongkir` mewarisi `Pelanggan` dengan sintaks `extends`.

```bash
public class Ongkir extends Pelanggan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Pelanggan` merupakan Polymorphism `TampilkanInfo` dan `TampilkanInfo` di `Ongkir` merupakan override dari method `TampilkanInfo` di `Pelanggan`.

```bash
public String tampilkanInfo() {
        String info = "";
        info += "=== DATA PELANGGAN ===\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        info += "No HP: " + noHp + "\n";
        info += "Jumlah Pesanan: " + jumlahPesanan + "\n";
        info += "Subtotal: Rp " + hitungSubtotal() + "\n";
        return info;

@Override
@Override
    public String tampilkanInfo() {
        String info = super.tampilkanInfo();
        info += "Wilayah: " + wilayah + "\n";
        info += "Ongkir: Rp " + ongkir + "\n";
        info += "TOTAL Bayar: Rp " + hitungTotal() + "\n";
        return info;
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `hitungOngkir` dan seleksi `switch` dalam method `wilayah`.

```bash
private int hitungOngkir(String wilayah) {
        if (wilayah.equalsIgnoreCase("martapura")) {
            return 1000;
        } else if (wilayah.equalsIgnoreCase("banjarbaru")) {
            return 2000;
        } else if (wilayah.equalsIgnoreCase("banjarmasin")) {
            return 3000;
        } else {
            return 0;
        }
    //return getNpm().substring(2, 4).equals("10") ? "Teknologi Informasi" : "Fakultas lain";
}

 String wilayah = "";
                switch (pilihWilayah) {
                    case 1:
                        wilayah = "Martapura";
                        break;
                    case 2:
                        wilayah = "Banjarbaru";
                        break;
                    case 3:
                        wilayah = "Banjarmasin";
                        break;
                    default:
                        throw new Exception("Wilayah tidak valid!");
                }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` dan `for` untuk pengulangan input.

```bash
while (ulang) {
    ...
}
  for (int i = 0; i < jumlah; i++) 
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);;
System.out.println("=== Aplikasi Pendataan Pelanggan Es Kristal ===");
System.out.print("Nama: ");
String nama = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` Pelanggan[] daftarPelanggan = new Pelanggan[2];` adalah contoh penggunaan array.

```bash
 Pelanggan[] daftarPelanggan = new Pelanggan[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
   System.out.println("Terjadi error: " + e.getMessage());
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

Nama: Raf'i Ramadhani
NPM: 2110010053
