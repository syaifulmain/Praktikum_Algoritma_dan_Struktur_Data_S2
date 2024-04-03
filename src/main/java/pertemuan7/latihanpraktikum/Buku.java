package pertemuan7.latihanpraktikum;

public class Buku {
    private final String kodeBuku;
    private final String judul;
    private final int tahunTerbit;
    private final String pengarang;
    private final int stok;

    public String getKodeBukuToLower() {
        return kodeBuku.toLowerCase();
    }

    public String getJudulToLower() {
        return judul.toLowerCase();
    }

    public Buku(String kodeBuku, String judul, int tahunTerbit, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampilDataBuku() {
        String data = """
            ------------------------
            Kode Buku       : %s
            Judul buku      : %s
            Tahun Terbit    : %d
            Pengarang       : %s
            Stok            : %d
            """.formatted(kodeBuku, judul, tahunTerbit, pengarang, stok);
        System.out.print(data);
    }

    public int compareTo(String cari, SortBy sortBy) {
        if (sortBy == SortBy.KODE_BUKU) {
            return this.getKodeBukuToLower().compareTo(cari);
        } else if (sortBy == SortBy.JUDUL) {
            return this.getJudulToLower().compareTo(cari);
        }
        return 0;
    }

    public int compareTo(Buku buku, SortBy sortBy) {
        if (sortBy == SortBy.KODE_BUKU) {
            return this.getKodeBukuToLower().compareTo(buku.getKodeBukuToLower());
        } else if (sortBy == SortBy.JUDUL) {
            return this.getJudulToLower().compareTo(buku.getJudulToLower());
        }
        return 0;
    }

    public boolean equals(String cari, SortBy sortBy) {
        if (sortBy == SortBy.KODE_BUKU) {
            return this.getKodeBukuToLower().equals(cari);
        } else if (sortBy == SortBy.JUDUL) {
            return this.getJudulToLower().equals(cari);
        }
        return false;
    }

    public boolean equals(Buku buku, SortBy sortBy) {
        if (sortBy == SortBy.KODE_BUKU) {
            return this.getKodeBukuToLower().equals(buku.getKodeBukuToLower());
        } else if (sortBy == SortBy.JUDUL) {
            return this.getJudulToLower().equals(buku.getJudulToLower());
        }
        return false;
    }
}
