package pertemuan2;

public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    Buku15 () {

    }

    Buku15(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual (int jml) {
        if (stok < jml) System.out.println("Stok tidak cukup");
        else {
            stok -= jml;
            terjual += jml;
            System.out.println("Berhasil terjual " + terjual + " buku");
        }

    }

    void restok (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal () {
        return terjual * harga;
    }

    int hitungDiskon() {
        if (hitungHargaTotal() > 150000) return 12;
        else if (hitungHargaTotal() >= 75000) return 5;
        else return 0;
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() * (100 - hitungDiskon()) / 100;
    }
}
