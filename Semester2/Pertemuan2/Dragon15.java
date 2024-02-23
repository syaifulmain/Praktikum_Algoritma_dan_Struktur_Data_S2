import java.util.Scanner;

public class Dragon15 {
    int x, y, width, height;
    Scanner scanner;

    public Dragon15(int width, int height, Scanner Scanner){
        this.width = width;
        this.height = height;
        this.scanner =  Scanner;
    }

    void move () {
        clearScreen();
        printPosition();
        System.out.print("Masukkan input a/s/d/w: ");
        switch (scanner.nextLine().toLowerCase()) {
            case "a" -> moveLeft(); // move left
            case "d" -> moveRight(); // move right
            case "w" -> moveUp(); // move up
            case "s" -> moveDown(); // move down
            default -> System.out.println("Invalid input");
        }
    }

    void moveLeft() {
        x -= 1;
    }

    void moveRight() {
        x += 1;
    }

    void moveUp() {
        y += 1;
    }

    void moveDown() {
        y -= 1;
    }

    void printPosition() {
        System.out.println("Posisi x: " + x + ", Posisi y: " + y);
        System.out.println("╔" + "═".repeat(width*2+1) + "╗");
        for (int i = 0; i < this.height + 1; i++) {
            if ((width-x-1)*2+2 < 0 || y> height) return;
            else if (y == this.height - i) System.out.println("║" + " ".repeat(x*2) + "D" + " ".repeat((width-x-1)*2+2) + "║");
            else System.out.println("║" + " ".repeat(width*2+1) + "║");
        }
        System.out.println("╚" + "═".repeat(width*2+1) + "╝");
    }

    boolean detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Posisi x: " + x + ", Posisi y: " + y);
            System.out.println("Game Over!");
            return false;
        }
        return true;
    }

    void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
