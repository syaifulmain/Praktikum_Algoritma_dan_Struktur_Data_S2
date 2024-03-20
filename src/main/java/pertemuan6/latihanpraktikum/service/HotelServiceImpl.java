package pertemuan6.latihanpraktikum.service;

import pertemuan6.latihanpraktikum.model.Hotel;

import java.util.Arrays;

public class HotelServiceImpl implements HotelService{
    private Hotel[] dataHotel = new Hotel[5];
    public HotelServiceImpl() {
        dataHotel[0] = new Hotel("Hotel A", "Jakarta", 1000000, (byte) 5);
        dataHotel[1] = new Hotel("Hotel B", "Bandung", 500000, (byte) 4);
        dataHotel[2] = new Hotel("Hotel C", "Surabaya", 300000, (byte) 3);
        dataHotel[3] = new Hotel("Hotel D", "Malang", 200000, (byte) 2);
        dataHotel[4] = new Hotel("Hotel E", "Bali", 1500000, (byte) 5);
    }

    @Override
    public Hotel[] getAllHotel() {
        return dataHotel.clone();
    }

    @Override
    public void tambahHotel(Hotel hotel) {
        dataHotel = Arrays.copyOf(dataHotel, dataHotel.length + 1);
        for (int i = 0; i < dataHotel.length; i++) {
            if (dataHotel[i] == null) {
                dataHotel[i] = hotel;
                break;
            }
        }
    }

    @Override
    public void tampilAll(Hotel[] dataHotel) {
        String lineTop      = "╔════╦═════════════════╦════════════╦════════════╦═════════╗";
        String header       = "║ NO ║ NAMA HOTEL      ║ KOTA       ║ HARGA(Rp)  ║ BINTANG ║";
        String lineMIddle   = "╠════╬═════════════════╬════════════╬════════════╬═════════╣";
        String main         = "║ %2d ║ %-15s ║ %-10s ║ %10s ║ %-7s ║";
        String lineBottom   = "╚════╩═════════════════╩════════════╩════════════╩═════════╝";
        System.out.println(lineTop);
        System.out.println(header);
        System.out.println(lineMIddle);
        for (int i = 0; i < dataHotel.length; i++) {
            if (dataHotel[i] != null) {
                System.out.printf(main,
                        i+1,
                        dataHotel[i].getNama(),
                        dataHotel[i].getKota(),
                        String.valueOf(dataHotel[i].getHarga()).replaceAll("\\B(?=(\\d{3})+(?!\\d))", "."),
                        "*".repeat(dataHotel[i].getBintang()));
                System.out.println();
            }
        }
        System.out.println(lineBottom);
    }

    @Override
    public void bubbleSort(Hotel[] dataHotel, int index) {
        if (index == 1) {
            for (int i = 0; i < dataHotel.length - 1; i++) {
                for (int j = 1; j < dataHotel.length - i; j++) {
                    if (dataHotel[j].getHarga() < dataHotel[j - 1].getHarga()) {
                        Hotel temp = dataHotel[j];
                        dataHotel[j] = dataHotel[j - 1];
                        dataHotel[j - 1] = temp;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < dataHotel.length - 1; i++) {
                for (int j = 1; j < dataHotel.length - i; j++) {
                    if (dataHotel[j].getBintang() > dataHotel[j - 1].getBintang()) {
                        Hotel temp = dataHotel[j];
                        dataHotel[j] = dataHotel[j - 1];
                        dataHotel[j - 1] = temp;
                    }
                }
            }
        }
        tampilAll(dataHotel);
    }

    @Override
    public void selectionSort(Hotel[] dataHotel, int index) {
        if (index == 1) {
            for (int i = 1; i < dataHotel.length; i++) {
                Hotel temp = dataHotel[i];
                int j = i;
                while (j > 0 && dataHotel[j - 1].getHarga() > temp.getHarga()) {
                    dataHotel[j] = dataHotel[j - 1];
                    j--;
                }
                dataHotel[j] = temp;
            }
        } else {
            for (int i = 1; i < dataHotel.length; i++) {
                Hotel temp = dataHotel[i];
                int j = i;
                while (j > 0 && dataHotel[j - 1].getBintang() < temp.getBintang()) {
                    dataHotel[j] = dataHotel[j - 1];
                    j--;
                }
                dataHotel[j] = temp;
            }
        }
        tampilAll(dataHotel);
    }
}
