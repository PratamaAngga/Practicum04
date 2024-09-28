import java.util.Scanner;

public class SiAkad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        String nilaiHuruf = "Belum ada nilai";
        String kualifikasi = "Belum ada nilai";
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Enter name: ");
        nama = sc.nextLine();
        System.out.print("Enter NIM: ");
        nim = sc.nextLine();
        System.out.print("Enter class: ");
        kelas = sc.nextLine();
        System.out.print("Enter absen number: ");
        absen = sc.nextByte();

        System.out.print("Enter quiz scores: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Enter assignment scores: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Enter UTS scores: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Enter UAS scores: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        if (80<nilaiAkhir && nilaiAkhir<=100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (73<nilaiAkhir && nilaiAkhir<=80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (65<nilaiAkhir && nilaiAkhir<=73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (60<nilaiAkhir && nilaiAkhir<=65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (50<nilaiAkhir && nilaiAkhir<=60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (39<nilaiAkhir && nilaiAkhir<=50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir<=39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else {
            System.out.println("Your grade is invalid!");
        }

        System.out.println();
        System.out.print("Name: " + nama + " | NIM: " + nim);
        System.out.println(" | Class: " + kelas + " | Absen number: " + absen);
        System.out.println("Final Scores: " + nilaiAkhir);
        System.out.println("Your Grade: " + nilaiHuruf);
        System.out.println("Qualification: " + kualifikasi);
    }
}
