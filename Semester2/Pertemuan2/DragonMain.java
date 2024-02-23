import java.util.Scanner;
public class DragonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 10;
        int height = 10;
        Dragon15 dragon1 = new Dragon15(width, height, scanner);
        while (dragon1.detectCollision(dragon1.x, dragon1.y)){
            dragon1.move();
        }
    } 
}