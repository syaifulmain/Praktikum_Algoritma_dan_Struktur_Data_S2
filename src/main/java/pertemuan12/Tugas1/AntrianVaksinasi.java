package pertemuan12.Tugas1;

import pertemuan12.doublelinkedlist.DoubleLinkedLists;

import java.util.Scanner;

public class AntrianVaksinasi {
    static DoubleLinkedLists<Pasien> dll = new DoubleLinkedLists<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int pilihan;
        do {
            menu();
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Pasien pasien = new Pasien();
                    System.out.print("No Antrian: ");
                    pasien.no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    pasien.nama = sc.nextLine();
                    tambahData(pasien);
                }
                case 2 -> {
                    Pasien pasien = dll.getFirst();
                    System.out.println(pasien.nama + " telah divaksin");
                    hapusData();
                }
                case 3 -> daftarData();
                case 4 -> System.out.println("Terima kasih");
                default -> System.out.println("Pilihan tidak tersedia");
            }
        } while (pilihan != 4);
    }

    static void menu() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Dafar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }

    static void tambahData(Pasien pasien) {
        dll.addLast(pasien);
    }

    static void hapusData() throws Exception {
        dll.removeFirst();
    }

    static void daftarData() throws Exception {
        DoubleLinkedLists<Pasien> data = dll.getAll();
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Daftar Penerima Vaksin");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("| No    | Nama              |");
        String format = "| %-5s | %-17s |";
        for (int i = 0; i < data.size(); i++) {
            System.out.printf((format) + "%n", data.get(i).no, data.get(i).nama);
        }
        System.out.println("Sisa antrian: " + data.size());
    }
}
