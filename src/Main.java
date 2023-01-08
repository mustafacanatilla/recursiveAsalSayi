import java.util.Scanner;

public class Main {

    static boolean asalMi(int sayi) {
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % 2 == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int sayi = scan.nextInt();

        if (asalMi(sayi)) {
            System.out.print(sayi + " Sayısı Asal Sayıdır !");
        } else
            System.out.print(sayi + " Sayısı Asal Değildir !");


    }
}