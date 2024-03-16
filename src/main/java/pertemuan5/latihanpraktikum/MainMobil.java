package pertemuan5.latihanpraktikum;

public class MainMobil {
    public static void main(String[] args) {
        Mobil[] mobil = new Mobil().getMobil();

        System.out.println("====== Tertinggi Top Acceleration ======");
        System.out.println(mobil[indexMaxAccelerationDC(mobil, 0, mobil.length - 1)]);

        System.out.println("====== Terendah Top Acceleration  ======");
        System.out.println(mobil[indexMinAccelerationDC(mobil, 0, mobil.length - 1)]);

        System.out.println("====== Rata-rata Top Acceleration ======");
        System.out.println("Rata-rata : " + sumTopPowerBF(mobil));
    }

    static int indexMaxAccelerationDC(Mobil[] mobil, int left, int right) {
        if (left == right) {
            return left;
        }
        int mid = (left + right) / 2;
        int leftIndex = indexMaxAccelerationDC(mobil, left, mid);
        int rightIndex = indexMaxAccelerationDC(mobil, mid + 1, right);
        return mobil[leftIndex].getTopAcceleration() > mobil[rightIndex].getTopAcceleration() ? leftIndex : rightIndex;
    }

    static int indexMinAccelerationDC(Mobil[] mobil, int left, int right) {
        if (left == right) {
            return left;
        }
        int mid = (left + right) / 2;
        int leftIndex = indexMinAccelerationDC(mobil, left, mid);
        int rightIndex = indexMinAccelerationDC(mobil, mid + 1, right);
        return mobil[leftIndex].getTopAcceleration() < mobil[rightIndex].getTopAcceleration() ? leftIndex : rightIndex;
    }

    static int sumTopPowerBF(Mobil[] mobil) {
        int sum = 0;
        for (Mobil m : mobil) {
            sum += m.getTopPower();
        }
        return sum;
    }
}
