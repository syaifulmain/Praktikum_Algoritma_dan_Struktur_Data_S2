package pertemuan6.latihanpraktikum.view;

import pertemuan6.latihanpraktikum.Util.ScannerUtil;
import pertemuan6.latihanpraktikum.model.Hotel;
import pertemuan6.latihanpraktikum.service.HotelService;

public class HotelView {
    private final HotelService hotelService;
    private final ScannerUtil scannerUtil;
    public HotelView(HotelService hotelService, ScannerUtil scannerUtil) {
        this.hotelService = hotelService;
        this.scannerUtil = scannerUtil;
    }
    public void mainMenu() {
        do {
            System.out.println("DAFTAR PENGINAPAN HOTEL");
            System.out.println("1. Tambah Hotel");
            System.out.println("2. Tampilkan Hotel");
            System.out.println("3. Keluar");
            int pilihan = scannerUtil.inputInt("Pilihan: ");
            switch (pilihan) {
                case 1 -> tambahHotelView();
                case 2 -> tampilkanHotelView();
                case 3 -> System.exit(0);
                default -> System.out.println("Pilihan tidak ada");
            }
        } while (true);
    }

    private void tambahHotelView() {
        System.out.println("Tambah Hotel");
        String nama = scannerUtil.inputString("Nama Hotel: ");
        String kota = scannerUtil.inputString("Kota: ");
        int harga = scannerUtil.inputInt("Harga: ");
        byte bintang = scannerUtil.inputByte("Bintang(1-5): ");
        hotelService.tambahHotel(new Hotel(nama, kota, harga, bintang));
    }

    private void tampilkanHotelView() {
        System.out.println("1. Data Asli");
        System.out.println("2. Urutkan Menggunakan Bubble Sort");
        System.out.println("3. Urutkan Menggunakan Selection Sort");
        Hotel[] dataHotel = hotelService.getAllHotel().clone();
        int pilihan = scannerUtil.inputInt("Pilihan: ");
        switch (pilihan) {
            case 1 -> hotelService.tampilAll(dataHotel);
            case 2 -> {
                System.out.println("Urutkan berdasarkan: ");
                System.out.println("1. Harga");
                System.out.println("2. Bintang");
                pilihan = scannerUtil.inputInt("Pilihan: ");
                switch (pilihan) {
                    case 1 -> hotelService.bubbleSort(dataHotel, 1);
                    case 2 -> hotelService.bubbleSort(dataHotel, 2);
                    default -> System.out.println("Pilihan tidak ada");
                }
            }
            case 3 -> {
                System.out.println("Urutkan berdasarkan: ");
                System.out.println("1. Harga");
                System.out.println("2. Bintang");
                pilihan = scannerUtil.inputInt("Pilihan: ");
                switch (pilihan) {
                    case 1 -> hotelService.selectionSort(dataHotel, 1);
                    case 2 -> hotelService.selectionSort(dataHotel, 2);
                    default -> System.out.println("Pilihan tidak ada");
                }
            }
            default -> System.out.println("Pilihan tidak ada");
        }
    }
}
