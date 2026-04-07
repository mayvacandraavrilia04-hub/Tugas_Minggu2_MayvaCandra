package tugas_minggu2_mayva_soal3;

import java.io.*;

public class Tugas_Minggu2_Mayva_Soal3 {
    public static void main(String[] args) throws Exception {
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);

        String nama, sUTS, sUAS, sTugas;
        double uts, uas, tugas;
        double nilaiMurniUTS, nilaiMurniUAS, nilaiMurniTugas, nilaiAkhir;

        System.out.print("Masukan Nama Siswa  : ");
        nama   = input.readLine();

        System.out.print("Nilai UTS           : ");
        sUTS   = input.readLine();

        System.out.print("Nilai UAS           : ");
        sUAS   = input.readLine();

        System.out.print("Nilai Tugas Mandiri : ");
        sTugas = input.readLine();

        uts   = Double.parseDouble(sUTS);
        uas   = Double.parseDouble(sUAS);
        tugas = Double.parseDouble(sTugas);

        nilaiMurniUTS   = uts   * 0.35;
        nilaiMurniUAS   = uas   * 0.45;
        nilaiMurniTugas = tugas * 0.20;
        nilaiAkhir      = nilaiMurniUTS + nilaiMurniUAS + nilaiMurniTugas;

        System.out.println("\nNama Siswa          : " + nama);
        System.out.println("Nilai Murni UTS     : " + nilaiMurniUTS);
        System.out.println("Nilai Murni UAS     : " + nilaiMurniUAS);
        System.out.println("Nilai Murni Tugas   : " + nilaiMurniTugas);
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
    }
}