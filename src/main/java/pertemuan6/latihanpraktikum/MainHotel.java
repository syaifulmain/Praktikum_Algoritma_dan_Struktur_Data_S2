package pertemuan6.latihanpraktikum;

import pertemuan6.latihanpraktikum.Util.ScannerUtil;
import pertemuan6.latihanpraktikum.service.HotelService;
import pertemuan6.latihanpraktikum.service.HotelServiceImpl;
import pertemuan6.latihanpraktikum.view.HotelView;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelServiceImpl();
        Scanner scanner = new Scanner(System.in);
        ScannerUtil scannerUtil = new ScannerUtil(scanner);
        HotelView hotelView = new HotelView(hotelService, scannerUtil);
        hotelView.mainMenu();
    }
}
