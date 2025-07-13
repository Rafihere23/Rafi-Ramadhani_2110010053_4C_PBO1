package pbo;

//io sederhana
import java.util.Scanner;

public class DataPelanggan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //array
        Pelanggan[] daftarPelanggan = new Pelanggan[2];
        int jumlah = 0;
        

        System.out.println("=== Aplikasi Pendataan Pelanggan Es Kristal ===");
       
        boolean ulang = true;
        
        //perulangan (while)
        while (ulang) {
            //error handling (try-catch)
            try {
                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                System.out.print("Alamat: ");
                String alamat = scanner.nextLine();

                System.out.print("No HP: ");
                String noHp = scanner.nextLine();

                System.out.print("Jumlah Pesanan: ");
                int jumlahPesanan = Integer.parseInt(scanner.nextLine());

                System.out.println("Pilih Wilayah Pengiriman:");
                System.out.println("1. Martapura");
                System.out.println("2. Banjarbaru");
                System.out.println("3. Banjarmasin");
                System.out.print("Pilihan: ");
                int pilihWilayah = Integer.parseInt(scanner.nextLine());

                //seleksi switch
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

                //objek
                Pelanggan pelanggan = new Ongkir(nama, alamat, noHp, jumlahPesanan, wilayah);

                daftarPelanggan[jumlah] = pelanggan;
                jumlah++;
                
                //seleksi if
                System.out.print("Tambah pelanggan lagi? (y/n): ");
                String jawab = scanner.nextLine();
                if (jawab.equalsIgnoreCase("n")) {
                    ulang = false;
                }

                if (jumlah >= daftarPelanggan.length) {
                    System.out.println("Data pelanggan penuh!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Terjadi error: " + e.getMessage());
            }
        }

        System.out.println("\n=== Daftar Pelanggan ===");
        //perulangan (for)
        for (int i = 0; i < jumlah; i++) {
            System.out.println(daftarPelanggan[i].tampilkanInfo());
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}