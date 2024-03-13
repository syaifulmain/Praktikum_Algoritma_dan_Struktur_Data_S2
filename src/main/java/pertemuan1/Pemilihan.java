package pertemuan1;

import java.util.Scanner;

public class Pemilihan {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String horizontalLine = "=".repeat(25);
        System.out.println("Program Menilai Nilai Akhir");
        System.out.println(horizontalLine);
        int tugas = inputInt("Masukkan Nilai Tugas");
        int kuiz = inputInt("Masukkan Nilai Kuiz");
        int uts = inputInt("Masukkan Nilai UTS");
        int uas = inputInt("Masukkan Nilai UAS");
        System.out.println(horizontalLine);
        System.out.println(horizontalLine);
        double nilaiAkhir = 0.0;
        boolean valid = true;
        if (isValid(tugas) || isValid(kuiz) || isValid(uts) || isValid(uas)){
            System.out.println("Nilai tidak valid");
            valid = false;
        } else {
            nilaiAkhir = (0.2 * tugas) + (0.2 * kuiz) + (0.3 * uts) + (0.3 * uas);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.print("Nilai Huruf : ");
            if (nilaiAkhir > 80) System.out.println("A");
            else if (nilaiAkhir > 73) System.out.println("B+");
            else if (nilaiAkhir > 65) System.out.println("B");
            else if (nilaiAkhir > 60) System.out.println("C+");
            else if (nilaiAkhir > 50) System.out.println("C");
            else if (nilaiAkhir > 39) System.out.println("D");
            else System.out.println("E");
        }
        System.out.println(horizontalLine);
        System.out.println(horizontalLine);
        if (valid) {
            if (nilaiAkhir > 50) System.out.println("SELAMAT ANDA LULUS");
            else System.out.println("MAAF ANDA TIDAK LULUS");
        }
        scanner.close();
    }

    static boolean isValid (int nilai) {
        return !(nilai >= 0 && nilai <= 100);
    }

    static int inputInt (String message) {
        while (true) {
            try {
                System.out.printf("%-20s%s" ,message, " : ");
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException ignored) {
                System.out.println("Input yang dimasukkan harus berupa angka");
            }
        }
    }
}