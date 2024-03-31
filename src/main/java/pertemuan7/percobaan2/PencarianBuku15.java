package pertemuan7.percobaan2;

public class PencarianBuku15 {
    Buku[] listBuku = new Buku[5];
    private int index;

//    PencarianBuku15() {
//        listBuku[0] = new Buku(20215, "Pemrograman Berbasis Objek dengan Java", 2004, "Indrajani", 100);
//        listBuku[1] = new Buku(20214, "Dasar Pemrograman Java", 2004, "Abdul Kadir", 200);
//        listBuku[2] = new Buku(20212, "Pemrograman Java", 2004, "Indrajani", 150);
//        listBuku[3] = new Buku(20211, "Pemrograman Berbasis Web", 2004, "Abdul Kadir", 200);
//        listBuku[4] = new Buku(20210, "Pemrograman Berbasis Objek", 2004, "Indrajani", 250);
//    }

    public void tambah(Buku buku) {
        if (index < listBuku.length) {
            listBuku[index] = buku;
            index++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    public void tampil() {
        for (Buku buku : listBuku) {
            buku.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public Buku findBuku(int cari) {
        for (Buku buku : listBuku) {
            if (buku.kodeBuku == cari) {
                return buku;
            }
        }
        return null;
    }

    public int findBinarySearch(int cari, int left, int right, SortBy sortBy) {
        int mid;

        if (right >= left) {
            mid = (left + right) / 2;
            if (listBuku[mid].kodeBuku == cari) {
                return mid;
            }
            if (sortBy == SortBy.ASC) {
                if (listBuku[mid].kodeBuku > cari) {
                    return findBinarySearch(cari, left, mid - 1, sortBy);
                }
                return findBinarySearch(cari, mid + 1, right, sortBy);
            } else {
                if (listBuku[mid].kodeBuku < cari) {
                    return findBinarySearch(cari, left, mid - 1, sortBy);
                }
                return findBinarySearch(cari, mid + 1, right, sortBy);
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            String data = """
            ========================
            Kode Buku       : %d
            Judul buku      : %s
            Tahun Terbit    : %d
            Pengarang       : %s
            Stok            : %d
            ========================
            """.formatted(listBuku[pos].kodeBuku, listBuku[pos].judul, listBuku[pos].tahunTerbit, listBuku[pos].pengarang, listBuku[pos].stok);
            System.out.print(data);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

}
