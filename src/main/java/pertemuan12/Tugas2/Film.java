package pertemuan12.Tugas2;

public class Film {
    String id;
    String judul;
    String rating;

    public Film() {
    }

    public Film(String id, String judul, String rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public Film(String id) {
        this.id = id;
        judul = "";
        rating = "";
    }
}
