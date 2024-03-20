package pertemuan6.latihanpraktikum.model;

public class Hotel {
    private final String nama;
    private final String kota;
    private final int harga;
    private final Byte bintang;

    public Hotel(String nama, String kota, int harga, Byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public int getHarga() {
        return harga;
    }

    public Byte getBintang() {
        return bintang;
    }
}
