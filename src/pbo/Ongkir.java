package pbo;

//inheritance
public class Ongkir extends Pelanggan {
    public String wilayah;
    public int ongkir;
    //overriding
    public Ongkir(String nama, String alamat, String noHp, int jumlahPesanan, String wilayah) {
        super(nama, alamat, noHp, jumlahPesanan);
        this.wilayah = wilayah;
        this.ongkir = hitungOngkir(wilayah);
    }

    //accesor
    public String getWilayah() {
        return wilayah;
    }

    public int getOngkir() {
        return ongkir;
    }

    //mutator
    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
        this.ongkir = hitungOngkir(wilayah);
    }

    //seleksi
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
    }

    public int hitungTotal() {
        return hitungSubtotal() + ongkir;
    }
    
    //polymorpishm (overriding)
    @Override
    public String tampilkanInfo() {
        String info = super.tampilkanInfo();
        info += "Wilayah: " + wilayah + "\n";
        info += "Ongkir: Rp " + ongkir + "\n";
        info += "TOTAL Bayar: Rp " + hitungTotal() + "\n";
        return info;
    }
}
