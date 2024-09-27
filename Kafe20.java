import java.util.Scanner;
public class Kafe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.println();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
        
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
        
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
        
            default:
                System.out.println("The selected size is not available!");
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println();
        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
}
