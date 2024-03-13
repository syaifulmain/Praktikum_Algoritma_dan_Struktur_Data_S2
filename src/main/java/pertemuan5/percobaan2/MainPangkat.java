package pertemuan5.percobaan2;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pangkat[] pangkat = tentukanJumlahElement(scanner);
        mainMenu(pangkat, scanner);
    }

    static Pangkat[] tentukanJumlahElement(Scanner scanner) {
        System.out.println("==========================================");
        System.out.print("Masukkan jumlah element yang dihitung : ");
        return new Pangkat[scanner.nextInt()];
    }

    static void mainMenu(Pangkat[] pangkat, Scanner scanner) {
        isiData(pangkat, scanner);
        int pilihan;
        do {
            System.out.println("Pilih metode perhitungan pangkat");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("3. Keluar");
            System.out.print("Pilihan : ");
            String temp = scanner.next();
            pilihan = (temp.matches("[1-3]") ? Integer.parseInt(temp) : 0);
            switch (pilihan) {
                case 1 -> pangkat(pangkat, Pangkat.Metode.BRUTE_FORCE);
                case 2 -> pangkat(pangkat, Pangkat.Metode.DIVIDE_AND_CONQUER);
            }
        } while (pilihan != 3);
    }

    static void isiData(Pangkat[] pangkat, Scanner scanner) {
        System.out.println("==========================================");
        for (int i = 0; i < pangkat.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            int n = scanner.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            int p = scanner.nextInt();
            pangkat[i] = new Pangkat(n, p);
            System.out.println("==========================================");
        }
    }

    static void pangkat(Pangkat[] pangkat, Pangkat.Metode metode) {
        System.out.println("==========================================");
        System.out.println("HASIL PANGKAT " + metode.toString());
        for (Pangkat value : pangkat) {
            System.out.printf("Hasil dari %d pangakat %d adalah %d%n",
                    value.nilai,
                    value.pangkat,
                    (metode == Pangkat.Metode.BRUTE_FORCE ?
                            Pangkat.pangkatBF(value.nilai, value.pangkat) :
                            Pangkat.pangkatDC(value.nilai, value.pangkat)));
        }
        System.out.println("==========================================");
    }
}
