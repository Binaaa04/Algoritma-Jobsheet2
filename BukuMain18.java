import java.util.Scanner;

/**
 * BukuMain18
 */
public class BukuMain18 {
    public static void main(String[] args) {
        Scanner BukuMain18 = new Scanner(System.in);
        Buku18 bk1 = new Buku18();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.tampilInformasi();

        bk1.terjual(5);
        bk1.gantiHarga(60000);

        System.out.print("Jumlah buku yang dibeli :");
        int jumlahDibeli = BukuMain18.nextInt();
        int hargaTotal = bk1.hitungHargaTotal(jumlahDibeli);
        System.out.println("Harga total: " + hargaTotal);

        double diskon = bk1.hitungDiskon(hargaTotal);
        System.out.println("Diskon: " + diskon);

        double hargaBayar = bk1.hitungHargaBayar(hargaTotal, diskon);
        System.out.println("Harga yang harus dibayar: " + hargaBayar);

        System.out.println();
        Buku18 bk2 = new Buku18("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        System.out.print("Jumlah buku yang dibeli :");
        int jumlahDibeli2 = BukuMain18.nextInt();
        int hargaTotal2 = bk2.hitungHargaTotal(jumlahDibeli2);
        System.out.println("Harga total: " + hargaTotal2);

        double diskon2 = bk2.hitungDiskon(hargaTotal2);
        System.out.println("Diskon: " + diskon2);

        double hargaBayar2 = bk2.hitungHargaBayar(hargaTotal2, diskon2);
        System.out.println("Harga yang harus dibayar: " + hargaBayar2);

        BukuMain18.close();
    }
}