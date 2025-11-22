package com.tugas;

import java.util.Scanner;
public class tugas3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //inisiaalisai , jam kerja, gaji pokok, golongan gaji, gaji, dan total gaji, gaji lembur, total gaji
      int jamKerja, gajiPokok, Gaji [] ={5000000,6500000,9500000};
      double totalGaji, gajiLembur, Lembur [] ={0.30,0.32,0.34,0.36,0.38};
      char golGaji;
      gajiPokok=0;
      gajiLembur=0;
      System.out.println("Tugas 3");
      System.out.println("Nama :Muhammad Yusuf");
      System.out.println("NIM : 056507296" +'\n');
      System.out.println("===========================");

      //Penentuan Gaji Berdasarkan Golongan ambil dari array Gaji
      System.out.println("Masukan Golongan Gaji : A/B/C");
      golGaji = input.next().toUpperCase().charAt(0);

      for (int gaji : Gaji){
        if (golGaji == 'A'){
            gajiPokok = Gaji[0];
        }
        else if (golGaji == 'B'){
            gajiPokok = Gaji[1];
        }
        else if (golGaji == 'C'){
            gajiPokok = Gaji[2];
        }
        else {
            System.out.println("Anda Memasukan Golongan yang Salah ! ");
        }
        break;
      }
      System.out.println("Gaji Pokok Anda Adalah :"+ gajiPokok);

      //Penentuan Gaji Lembur ambil dari array
      System.out.println("Masukan Jam Kerja");
      jamKerja = input.nextInt();

      for (int i=0; i<Lembur.length; i++){
        if (jamKerja == 1){
            gajiLembur = gajiPokok*Lembur[0];
        }
        else if (jamKerja == 2){
            gajiLembur = gajiPokok*Lembur[1];
        }
        else if (jamKerja == 3){
            gajiLembur = gajiPokok*Lembur[2];
        }
        else if (jamKerja == 4){
            gajiLembur = gajiPokok*Lembur[3];
        }
        else if (jamKerja >= 5){
            gajiLembur = gajiPokok*Lembur[4];
        }
        else {
            gajiLembur = gajiPokok*0;
        }
        break;
      }
    System.out.printf("GajiLembur Anda Adalah : % .0f%n", gajiLembur);

    //menghitung total Gaji
      totalGaji = gajiPokok + gajiLembur;
      System.out.printf("Total Gaji Anda Adalah : % .0f%n", totalGaji);
      System.out.println("============SELESAI==============");
    }
}
