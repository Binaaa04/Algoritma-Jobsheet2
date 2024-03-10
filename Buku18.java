/**
 * Buku18
 */
public class Buku18 {
    String judul, pengarang;
    int halaman, stok, harga, jumlahDibeli;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : " + harga);
    }

    void terjual(int jml) {
        if (jml > 0) {
            stok -= jml;
        } else if (jml < 0) {
            System.out.println("Maaf, stok habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku18() {
    }

    public Buku18(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal(int jumlahDibeli) {
        return harga * jumlahDibeli;
    }

    double hitungDiskon(int totalHarga) {
        double diskon = 0;
        if (totalHarga > 150000) {
            diskon = 0.12 * totalHarga;
        } else if (75000 > totalHarga || totalHarga < 150000) {
            diskon = 0.5 * totalHarga;
        }
        return diskon;
    }

    double hitungHargaBayar(int totalHarga, double diskon) {
        return totalHarga - diskon;
    }

    public Buku18(String namaMahasiswa) {
        judul = "Buku" + namaMahasiswa;
        pengarang = namaMahasiswa;
    }
}
