import java.util.Scanner;

public class PemilihanBilangan20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();

        // if (angka % 2 == 0) {
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // } else {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        String jenisAngka = (angka % 2 == 0) ? "Bilangan positif" : "Bilangan ganjil";
        System.out.println("Angka " + angka + " termasuk " + jenisAngka);
    }
}