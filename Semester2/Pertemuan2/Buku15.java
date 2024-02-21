public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual (int jumlah) {
        stok = stok - jumlah;
    }

    void restok (int jumlah) {
        stok = stok + jumlah;
    }

    void gantiHarga (int hargaBaru) {
        harga = hargaBaru;
    }
}
