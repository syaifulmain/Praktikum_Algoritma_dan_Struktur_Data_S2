import java.util.Scanner;

public class Array {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] matkul = {
                "Keselamatan dan Kesehatan Kerja",
                "Pancasila",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Critical Thinking dan Problem Solving",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Konsep Teknologi Informasi"
        };
        int[] bobotSKS = { 2, 2, 3, 2, 2, 2, 3, 2 };
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobotNilai = new double[matkul.length];
        String horizontalLine = "=".repeat(90);

        System.out.println(horizontalLine);
        System.out.println("Program Menghitung IP Semester");
        System.out.println(horizontalLine);

        for (int i = 0; i < matkul.length; i++) {
            int nilai = inputInt("Masukkan Nilai Angka untuk MK " + matkul[i]);
            nilaiAngka[i] = nilai;
            if (nilai > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilai > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilai > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilai > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilai > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilai > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }
        System.out.println(horizontalLine);

        System.out.println("Hasil Konversi Nilai");
        System.out.println(horizontalLine);
        String format = "%-45s%-15s%-15s%-15s\n";
        System.out.printf(format, "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf(format, matkul[i], "    " +nilaiAngka[i], "     " + nilaiHuruf[i], "   " +bobotNilai[i]);
        }
        System.out.println(horizontalLine);

        int sumSKS = 0;
        double sumNilai = 0;

        for (int i = 0; i < matkul.length; i++) {
            sumSKS += bobotSKS[i];
            sumNilai += bobotSKS[i] * bobotNilai[i];
        }

        double ip = sumNilai / sumSKS;
        System.out.printf("IP Semester : %.2f", + ip);
    }

    static String inputString (String message) {
        System.out.printf("%-70s%s" ,message, " : ");
        return scanner.nextLine().trim();
    }

    static int inputInt (String message) {
        while (true) {
            try {
                return Integer.parseInt(inputString(message));
            } catch (NumberFormatException ignored) {
                System.out.println("Input yang dimasukkan harus berupa angka");
            }
        }
    }
}

