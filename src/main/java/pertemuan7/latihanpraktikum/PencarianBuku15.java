package pertemuan7.latihanpraktikum;

import java.util.Arrays;

public class PencarianBuku15 {
    private Buku[] listBuku;

    public PencarianBuku15() {
        listBuku = new Buku[]{
                new Buku("111", "Buku A", 2021, "Pengarang A", 10),
                new Buku("222", "Buku A", 2021, "Pengarang B", 10),
                new Buku("666", "Buku F", 2021, "Pengarang F", 10),
                new Buku("888", "Buku H", 2021, "Pengarang H", 10),
                new Buku("444", "Buku D", 2021, "Pengarang D", 10),
                new Buku("999", "Buku I", 2021, "Pengarang I", 10),
                new Buku("555", "Buku E", 2021, "Pengarang E", 10),
                new Buku("777", "Buku G", 2021, "Pengarang G", 10),
                new Buku("333", "Buku C", 2021, "Pengarang C", 10),
        };
    }

    public void tambah(Buku buku) {
        listBuku = Arrays.copyOf(listBuku, listBuku.length + 1);
        listBuku[listBuku.length - 1] = buku;
    }

    public void tampil() {
        Arrays.stream(listBuku).forEach(Buku::tampilDataBuku);
    }

    public int findSequentialSearch(String cari, SortBy sortBy) {
        Buku[] listBukuCopy = sortBy(sortBy);
        return sequentialSearch(listBukuCopy, cari, sortBy);
    }

    public int findBinarySearch(String cari, SortBy sortBy) {
        Buku[] listBukuCopy = sortBy(sortBy);
        return BinarySearch(listBukuCopy, cari, 0, listBukuCopy.length - 1, sortBy);
    }

    public void tampilData(String x, int pos, SortBy sortBy) {
        if (pos != -1) {
            int[] dupe = duplicateCheck(x, sortBy);
            if (dupe.length > 1) {
                System.out.println("Data \"" + x + "\" ditemukan lebih dari satu");
                for (int i : dupe) {
                    listBuku[i].tampilDataBuku();
                }
            } else {
                listBuku[pos].tampilDataBuku();
            }
        } else {
            System.out.println("Data \"" + x + "\" tidak ditemukan");
        }
    }

    private Buku[] sortBy(SortBy sortBy) {
        Buku[] listBukuCopy = Arrays.copyOf(this.listBuku, this.listBuku.length);
        Arrays.sort(listBuku, (o1, o2) -> o1.compareTo(o2, sortBy));
        return listBukuCopy;
    }

    private int sequentialSearch(Buku[] listBuku, String cari, SortBy sortBy) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].equals(cari, sortBy)) {
                return i;
            }
        }
        return -1;
    }

    private int BinarySearch(Buku[] listBuku, String cari, int left, int right, SortBy sortBy) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBuku[mid].equals(cari, sortBy)) {
                return mid;
            } else if (listBuku[mid].compareTo(cari, sortBy) > 0) {
                return BinarySearch(listBuku, cari, left, mid - 1, sortBy);
            } else {
                return BinarySearch(listBuku, cari, mid + 1, right, sortBy);
            }
        }
        return -1;
    }

    private int[] duplicateCheck(String check, SortBy sortBy) {
        int[] dupe = new int[0];
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].equals(check, sortBy)) {
                dupe = Arrays.copyOf(dupe, dupe.length + 1);
                dupe[dupe.length - 1] = i;
            }
        }
        return dupe;
    }
}