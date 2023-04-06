import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = sc.nextInt();
        sc.close();
        if (asalMi(sayi)) {
            System.out.println(sayi + " sayısı ASALdır.");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        } else if (sayi == 2) {
            return true;
        } else if (sayi % 2 == 0) {
            return false;
        } else {
            return asalMi(sayi, 3);
        }
    }

    public static boolean asalMi(int sayi, int bolen) {
        if (bolen * bolen > sayi) {
            return true;
        } else if (sayi % bolen == 0) {
            return false;
        } else {
            return asalMi(sayi, bolen + 2);
        }
    }
}
