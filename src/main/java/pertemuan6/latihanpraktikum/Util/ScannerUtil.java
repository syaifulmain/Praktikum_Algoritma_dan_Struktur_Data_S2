package pertemuan6.latihanpraktikum.Util;

import java.util.Scanner;

public class ScannerUtil {
    private final Scanner scanner;

    public ScannerUtil(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int inputInt(String message) {
        String temp = inputString(message);
        long tempInt = (temp.matches("[0-9]+")) ? Long.parseLong(temp) : 0;
        return (tempInt < 100_000_000) ? (int) tempInt : 99_999_999;
    }

    public Byte inputByte(String message) {
        String temp = inputString(message);
        return (temp.matches("[1-5]") ? Byte.parseByte(temp) : 0);
    }
}
