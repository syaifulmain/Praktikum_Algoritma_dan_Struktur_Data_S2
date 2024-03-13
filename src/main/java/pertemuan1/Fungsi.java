package pertemuan1;

import java.util.Scanner;

public class Fungsi{
static Scanner scanner = new Scanner(System.in);

    static int[][] stok = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 },
    };

    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int totalCabang = 4;
    static int[][] logBunga = new int[totalCabang][namaBunga.length];
    public static void main(String[] args) {
        homeView();
    }

    static void homeView() {
        while (true) {
            renderTitle("Royal Garden");
            int userInput = pickMenu("Menu", new String[] {
                    "Perhitungan Penjualan",
                    "Pengurangan Stok",
                    "Log pengurangan stok",
            });
            switch (userInput) {
                case 1 -> perhitunganPenjualan();
                case 2 -> penguranganStok();
                case 3 -> logPenguranganStok();
            }
        }
    }

    static void perhitunganPenjualan() {
        int reap = 10;
        renderTitle("Stok Bunga");
        renderTabelStok(stok);
        renderTitle("Perhitungan Penjualan");
        String topLine = "╔════════" + ("═".repeat(reap) + "╦").repeat(5) + "═".repeat(reap) + "╗";
        String middleLine = "╠════════" + ("═".repeat(reap) + "╬").repeat(5) + "═".repeat(reap) + "╣";
        String buttonLine = "╚════════" + ("═".repeat(reap) + "╩").repeat(5) + "═".repeat(reap) + "╝";

        String format = "║  %-16s║ %-9s║ %-9s║ %-9s║ %-9s║ %-9s║\n";
        System.out.println(topLine);
        System.out.printf(format, "Cabang", namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3], "Total");
        System.out.println(middleLine);
        int[] total = new int[4];
        for (int i = 0; i < totalCabang; i++) {
            int totalHaraga = 0;
            for (int j = 0; j < namaBunga.length; j++) {
                totalHaraga += stok[i][j] * hargaBunga[j];
                total[j] += stok[i][j] * hargaBunga[j];
            }
            System.out.printf(format, "Royal Garden " + (i + 1), stok[i][0] * hargaBunga[0], stok[i][1] * hargaBunga[1], stok[i][2] * hargaBunga[2], stok[i][3] * hargaBunga[3], totalHaraga);
        }
        System.out.println(middleLine);
        String formatEnd = "║  %-16s║" + " ".repeat(50) + "║\n";
        System.out.printf(format, "Total", total[0], total[1], total[2], total[3], (total[0] + total[1] + total[2] + total[3]));
        System.out.println(buttonLine);
        emptyPress();
        clearScreen();

    }

    static void penguranganStok() {
        renderTitle("Pengurangan Stok");
        int cabang = pickMenu("Pilih Cabang", new String[] {
                "Royal Garden 1",
                "Royal Garden 2",
                "Royal Garden 3",
                "Royal Garden 4" ,
                "Back"}) - 1;
        if (cabang == 4) return;
        renderTabelStokPengurangan(cabang);
        String userInput = getInputStringNumberwithLimit("  Pilih Bunga(kosongkan untuk kembali)", 1, namaBunga.length, true);
        if (userInput.isEmpty()) return;
        int bunga = Integer.parseInt(userInput) - 1;
        int jumlah = Integer.parseInt(getInputStringNumberwithLimit("Jumlah yang ingin dikurangi", 1, stok[cabang][bunga], false));
        stok[cabang][bunga] -= jumlah;
        logBunga[cabang][bunga] -= jumlah;
        System.out.println("Stok berhasil dikurangi");
        emptyPress();
        clearScreen();
    }

    static void logPenguranganStok() {
        renderTitle("Log Pengurangan Stok");
        renderTabelStok(logBunga);
        emptyPress();
        clearScreen();
    }

    static void renderTabelStokPengurangan(int cabang) {
        renderTitle("Royal Garden " + (cabang + 1) + " Stok Bunga");
        String firstLine = "╔" + "═".repeat(21) + "╦" + "═".repeat(20) + "╗";
        String middleLine = "╠" + "═".repeat(21) + "╬" + "═".repeat(20) + "╣";
        String lastLine = "╚" + "═".repeat(21) + "╩" + "═".repeat(20) + "╝";
        String format = "║ %-20s║       %-13s║\n";
        System.out.println(firstLine);
        System.out.printf(format, "Bunga", "Stok");
        System.out.println(middleLine);
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf(format, (i + 1) + ". " +namaBunga[i], stok[cabang][i]);
        }
        System.out.println(lastLine);
    }

    static void renderTabelStok(int[][] array) {
        int reap = 10;
        String topLine = "╔════════" + ("═".repeat(reap) + "╦").repeat(4) + "═".repeat(reap) + "╗";
        String middleLine = "╠════════" + ("═".repeat(reap) + "╬").repeat(4) + "═".repeat(reap) + "╣";
        String bottomLine = "╚════════" + ("═".repeat(reap) + "╩").repeat(4) + "═".repeat(reap) + "╝";
        String formatCol = "║  %-16s║ %-9s║ %-9s║ %-9s║ %-9s║\n";
        System.out.println(topLine);
        System.out.printf(formatCol, "Cabang", namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3]);
        System.out.println(middleLine);
        String formatRow = "║  %-16s║    %-6s║    %-6s║    %-6s║    %-6s║\n";
        for (int i = 0; i < totalCabang; i++) {
            System.out.printf(formatRow, "Royal Garden " + (i + 1), array[i][0], array[i][1], array[i][2], array[i][3]);
        }
        System.out.println(bottomLine);
    }

    static void emptyPress() {
        System.out.println("Tekan enter untuk melanjutkan");
        scanner.nextLine();
    }

    static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.print("\033[2J\033[1;1H");
    System.out.flush();
    }

    static void exit() {
        clearScreen();
        System.out.println("Keluar.........");
        System.exit(0);
    }

    static void renderTitle(String title) {
        String fixTittle = (title.length() > 40) ? title.substring(0, 40) : title;
        int titleLength = fixTittle.length();
        String firstLine = "╔" + "═".repeat(42) + "╗";
        String lastLine = "╚" + "═".repeat(42) + "╝";
        System.out.println(firstLine);
        System.out.println((titleLength % 2 == 0)
                ? "║" + " ".repeat((42 - titleLength) / 2) + fixTittle + " ".repeat((42 - titleLength) / 2) + "║"
                : "║" + " ".repeat((42 - titleLength) / 2) + title + " ".repeat((42 - titleLength) / 2 + 1) + "║");
        System.out.println(lastLine);
    }

    static String input(String message) {
        System.out.print(message + " : ");
        return scanner.nextLine().trim();
    }

    static String getInputString(String prompt, boolean allowEmpty) {
        while (true) {
            String userInput = input(prompt);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (!userInput.isEmpty())
                return userInput;
            System.out.println("Masukan tidak boleh kosong!");
        }
    }

    static String getInputStringNumber(String prompt, boolean allowEmpty) {
        while (true) {
            String userInput = getInputString(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (userInput.matches("[0-9]+"))
                return userInput;
            System.out.println("Masukan hanya boleh angka !");
        }
    }

    static String getInputStringNumberwithLimit(String prompt, int min, int max, boolean allowEmpty) {
        while (true) {
            String userInput = getInputStringNumber(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (Integer.parseInt(userInput) >= min && Integer.parseInt(userInput) <= max)
                return userInput;
            System.out.println("Masukan yang tersedia " + min + "-" + max);
        }
    }

    static int pickMenu(String menuTitle, String[] menus) {
        int i = 0;
        String formatMenu = "║ %-40s ║%n";
        String firstLine = "╔" + "═".repeat(42) + "╗";
        String middleLine = "╠" + "═".repeat(42) + "╣";
        String lastLine = "╚" + "═".repeat(42) + "╝";
        System.out.println(firstLine);
        System.out.printf(formatMenu, menuTitle);
        System.out.println(middleLine);
        while (i < menus.length) {
            System.out.printf(formatMenu, String.format("%d. %s", i + 1, menus[i]));
            i++;
        }
        System.out.printf(formatMenu, String.format("%d. %s", i + 1, "Keluar"));
        System.out.println(lastLine);
        while (true) {
            String userInput = getInputStringNumberwithLimit("  Pilih menu", 1, menus.length + 1, false);
            int userNumber = Integer.parseInt(userInput);
            if (userNumber == menus.length + 1)
                exit();
            if (!(userNumber < 1 || userNumber > menus.length)) {
                return userNumber;
            }
            System.out.println("Format masukan salah");
        }
    }
}
