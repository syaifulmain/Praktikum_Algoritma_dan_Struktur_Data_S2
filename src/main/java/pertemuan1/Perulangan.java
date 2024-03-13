package pertemuan1;

import java.util.Scanner;

public class Perulangan {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String horizontalLine = "=".repeat(25);
        String NIM = inputString("Masukkan NIM");
        System.out.println(horizontalLine);
        int n = inputInt("Masukkan n");
        for (int i = 1; i <= n; i++) {
            String value;
            if (i % 2 != 0) value = "*";
            else if ( i == 6 || i == 10) continue;
            else value = String.valueOf(i);
            System.out.print(value + " "); 
        }
    }

    static String inputString (String message) {
        System.out.printf("%-15s%s" ,message, " : ");
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
