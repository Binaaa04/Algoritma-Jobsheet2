import java.util.Scanner;

/**
 * DragonMain18
 */
public class DragonMain18 {
    public static void main(String[] args) {
        Scanner dragonMain = new Scanner(System.in);
        Dragon18 dragon = new Dragon18();
        dragon.width = 10;
        dragon.height = 10;
        dragon.x = 0;
        dragon.y = 0;
        int targetX = 8;
        int targetY = 8;

        System.out.println("Selamat datang di game Dragon Adventure!");
        System.out.println("Tujuan Anda adalah untuk mencapai titik akhir.");
        System.out.println("Posisi awal dragon:");
        dragon.printPosition();

        while (true) {
            System.out.print("Masukkan nilai x :");
            dragon.x = dragonMain.nextInt();
            System.out.print("Masukkan nilai y :");
            dragon.y = dragonMain.nextInt();

            System.out.println("1. Kiri");
            System.out.println("2. Kanan");
            System.out.println("3. Atas");
            System.out.println("4. Bawah");
            System.out.println("0. Keluar");

            while (dragon.x != targetX || dragon.y != targetY) {
                System.out.print("Pilih arah gerak dragon:");
                int pilihan = dragonMain.nextInt();

                switch (pilihan) {
                    case 1:
                        dragon.moveLeft();
                        break;
                    case 2:
                        dragon.moveRight();
                        break;
                    case 3:
                        dragon.moveUp();
                        break;
                    case 4:
                        dragon.moveDown();
                        break;
                    case 0:
                        System.out.println("Anda keluar dari permainan.");
                        dragonMain.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }

                if (dragon.x == targetX && dragon.y == targetY) {
                    System.out.println("Selamat! Anda telah mencapai titik akhir!");
                    dragonMain.close();
                    return;
                }
                dragon.printPosition();

            }

            dragonMain.close();
        }
    }
}