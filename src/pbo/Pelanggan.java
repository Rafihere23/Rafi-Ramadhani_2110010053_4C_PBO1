package pbo;

//class
public class Pelanggan {
    //string dan encapsulation
    public String nama;
    public String alamat;
    public String noHp;
    public int jumlahPesanan;
    
    //constructor
    public Pelanggan(String nama, String alamat, String noHp, int jumlahPesanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.jumlahPesanan = jumlahPesanan;
    }

    //accesor (getter)
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

    //mutator (setter)
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

    public int hitungSubtotal() {
        return jumlahPesanan * 10000;
    }
    
    //polymorphism
    public String tampilkanInfo() {
        String info = "";
        info += "=== DATA PELANGGAN ===\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        info += "No HP: " + noHp + "\n";
        info += "Jumlah Pesanan: " + jumlahPesanan + "\n";
        info += "Subtotal: Rp " + hitungSubtotal() + "\n";
        return info;
    }
}
