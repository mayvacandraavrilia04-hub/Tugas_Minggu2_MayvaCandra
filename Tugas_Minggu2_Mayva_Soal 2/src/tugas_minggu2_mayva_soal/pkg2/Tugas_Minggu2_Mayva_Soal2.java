package tugas_minggu2_mayva_soal.pkg2;

import java.io.*;

public class Tugas_Minggu2_Mayva_Soal2 {
    public static void main(String[] args) throws Exception {
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);

        String s1;
        double radius, luas, keliling;
        final double PI = 3.14159;

        System.out.print("Masukan Nilai Radius : ");
        s1 = input.readLine();

        radius   = Double.parseDouble(s1);
        luas     = PI * radius * radius;
        keliling = 2 * PI * radius;

        System.out.println("\nHasil Perhitungan");
        System.out.println("Luas Lingkaran     : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}