import java.util.Scanner;
public class fitur_diskon_dan_pembelian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga, jumlah, total, diskon;
        
        /*Program untuk menghitung total pembayaran */ 
        System.out.print("Masukkan Harga Beras /kg: ");
        harga = sc.nextInt();
        System.out.print("Masukkan Jumlah Beras(kg):  ");
        jumlah = sc.nextInt();
        total = harga * jumlah;
        System.out.println("Total harga: " + total);

        /* menghitung diskon */ 
        diskon = (5 * total) / 100;
        int totalBayar = total - diskon;
        System.out.println("Total yang harus dibayar setelah diskon: " + totalBayar);

        /*input uang dan output kembalian */
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int uangDibayar = sc.nextInt();
        int kembalian = uangDibayar - totalBayar;
        System.out.println("Uang kembalian: " + kembalian);
        }
}