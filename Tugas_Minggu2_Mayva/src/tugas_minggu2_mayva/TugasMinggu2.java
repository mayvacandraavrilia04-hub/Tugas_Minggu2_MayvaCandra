package tugas_minggu2_mayva;

import java.io.*;

public class TugasMinggu2 {
    public static void main(String[] args) throws Exception {
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);

        String s1;
        double celcius, fahrenheit, reamur;

        System.out.print("Masukan Nilai Derajat Celcius : ");
        s1 = input.readLine();

        celcius    = Double.parseDouble(s1);
        fahrenheit = (celcius * 9 / 5) + 32;
        reamur     = celcius * 4 / 5;

        System.out.println("\nHasil Konversi");
        System.out.println("Derajat Fahrenheit : " + fahrenheit);
        System.out.println("Derajat Reamur     : " + reamur);
    }
}