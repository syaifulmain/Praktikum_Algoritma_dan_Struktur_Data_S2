package pertemuan7.percobaan2;

import java.util.Scanner;

public class BukuMain15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PencarianBuku15 data = new PencarianBuku15();
        int jumlahBuku = 5;

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("===================================");
            System.out.print("Kode Buku\t\t: ");
            int kodeBuku = Integer.parseInt(scanner.nextLine());
            System.out.print("Judul Buku\t\t: ");
            String judulBuku = scanner.nextLine();
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = Integer.parseInt(scanner.nextLine());
            System.out.print("Pengarang\t\t: ");
            String pengarang = scanner.nextLine();
            System.out.print("Stok\t\t\t: ");
            int stok = Integer.parseInt(scanner.nextLine());

            Buku buku = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(buku);
        }
        System.out.println("===================================");
        System.out.println("Data Keseluruahn Buku");
        data.tampil();
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("Pencarian Data Buku");
        System.out.println("Masukan kode buku yang dicari");
        System.out.print("Kode buku : ");
        int cari = Integer.parseInt(scanner.nextLine());
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        Buku dataBuku = data.findBuku(cari);
        dataBuku.tampilDataBuku();
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearcch(cari, 0, jumlahBuku - 1, SortBy.DESC);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
