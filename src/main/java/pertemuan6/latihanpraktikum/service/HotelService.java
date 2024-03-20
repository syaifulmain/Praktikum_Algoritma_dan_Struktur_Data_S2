package pertemuan6.latihanpraktikum.service;

import pertemuan6.latihanpraktikum.model.Hotel;

public interface HotelService {
    Hotel[] getAllHotel();
    void tambahHotel(Hotel hotel);
    void tampilAll(Hotel[] dataHotel);
    void bubbleSort(Hotel[] dataHotel, int index);
    void selectionSort(Hotel[] dataHotel, int index);
}
