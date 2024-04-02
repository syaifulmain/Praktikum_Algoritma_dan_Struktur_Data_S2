package pertemuan7.latihanpraktikum;

import java.util.Scanner;

public class BukuMain15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PencarianBuku15 pencarianBuku15 = new PencarianBuku15();
        mainView(scanner, pencarianBuku15);
    }

    static void mainView(Scanner scanner, PencarianBuku15 pencarianBuku15) {
        int pilih;
        do {
            String line = "----------------------------------------------------------";
            System.out.println("Data Buku");
            pencarianBuku15.tampil();

            System.out.println(line);
            System.out.println("Pencarian data buku");
            System.out.println("1. Pencarian data berdasarkan kode buku");
            System.out.println("2. Pencarian data berdasarkan judul buku");
            System.out.println("3. Tambahan data buku");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1/2/3/4) : ");
            String stringPilih = scanner.nextLine();
            pilih = (stringPilih.matches("[1-4]") ? Integer.parseInt(stringPilih) : 0);
            switch (pilih) {
                case 1 -> search(scanner, pencarianBuku15, SortBy.KODE_BUKU);
                case 2 -> search(scanner, pencarianBuku15, SortBy.JUDUL);
                case 3 -> tambahData(scanner, pencarianBuku15);
                default -> System.out.println("Menu tidak tersedia");
            }
            if (pilih != 4) {
                System.out.print("Tekan enter untuk melanjutkan");
                scanner.nextLine();
            }
            System.out.println(line);
        } while (pilih != 4);
    }

    static void search(Scanner scanner, PencarianBuku15 pencarianBuku15, SortBy sortBy) {
        System.out.print("Masukkan data yang dicari : ");
        String cari = scanner.nextLine().toLowerCase();
        System.out.println("Menggunakan sequential search");
        int pos = pencarianBuku15.findSequentialSearch(cari, sortBy);
        pencarianBuku15.tampilData(cari, pos, sortBy);
        System.out.println("Menggunakan binary search");
        pos = pencarianBuku15.findBinarySearch(cari, sortBy);
        pencarianBuku15.tampilData(cari, pos, sortBy);
    }

    static void tambahData(Scanner scanner, PencarianBuku15 pencarianBuku15) {
        System.out.print("Masukkan kode buku : ");
        String kodeBuku = scanner.nextLine();
        System.out.print("Masukkan judul buku : ");
        String judulBuku = scanner.nextLine();
        System.out.print("Masukkan tahun terbit : ");
        int tahunTerbit = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan pengarang : ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan stok : ");
        int stok = Integer.parseInt(scanner.nextLine());
        System.out.println("Data berhasil ditambahkan");
        Buku buku = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
        pencarianBuku15.tambah(buku);
    }
}
