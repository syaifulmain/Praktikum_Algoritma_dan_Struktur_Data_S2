package pertemuan7.percobaan1;

public class Buku {
    int kodeBuku;
    String judul;
    int tahunTerbit;
    String pengarang;
    int stok;

    public Buku(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampilDataBuku() {
        String data = """
            ========================
            Kode Buku       : %d
            Judul buku      : %s
            Tahun Terbit    : %d
            Pengarang       : %s
            Stok            : %d
            ========================
            """.formatted(kodeBuku, judul, tahunTerbit, pengarang, stok);
        System.out.print(data);
    }
}
