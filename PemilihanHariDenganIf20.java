import java.util.Scanner;
public class PemilihanHariDenganIf20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.print("Input a number: ");
        angka = sc.nextInt();

        if (angka == 1 || angka == 2 || angka == 3 || angka == 4 || angka == 5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Weekend");
        }else {
            System.out.println("The number you input is invalid number!");
        }
    }
}
