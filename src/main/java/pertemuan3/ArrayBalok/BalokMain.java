package pertemuan3.ArrayBalok;

public class BalokMain {
    public static void main(String[] args) {
        Balok[] balokArray = new Balok[4];
        // tanpa parameter
        balokArray[0] = new Balok();
        balokArray[0].panjang = 100;
        balokArray[0].lebar = 10;
        balokArray[0].tinggi = 10;
        // satu parameter
        balokArray[1] = new Balok(200);
        balokArray[1].lebar = 10;
        balokArray[1].tinggi = 10;
        // dua parameter
        balokArray[2] = new Balok(300, 10);
        balokArray[2].tinggi = 10;
        // tiga parameter
        balokArray[3] = new Balok(400, 10, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Volume Balok ke-" + i + " : " + balokArray[i].hitungVolume());
        }
    }
}
