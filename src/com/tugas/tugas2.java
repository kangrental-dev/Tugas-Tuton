package com.tugas;

import java.util.Scanner;

public class tugas2 {
    public static void main ( String [] args) {
      Scanner input = new Scanner(System.in);
      
      //inisiaalisai , jam kerja, golongan gaji, gaji, dan total gaji
      int jamKerja, Gaji;
      double gajiLembur, totalGaji;
      char golGaji;
      Gaji =0;
      System.out.println("Tugas 2");
      System.out.println("Nama :Muhammad Yusuf");
      System.out.println("NIM : 056507296" +'\n');
      System.out.println("===========================");
      
      //Penentuan Gaji Berdasarkan Golongan
      System.out.println("Masukan Golongan Gaji : A/B/C");
      golGaji = input.next().toUpperCase().charAt(0);
      
      if (golGaji =='A') {
        Gaji = 5000000;
      }
      else if (golGaji == 'B'){
        Gaji = 6500000;
      }
      else if (golGaji == 'C'){
        Gaji = 9500000;
      }
      else {
        System.out.println("Anda memasukan golongan gaji yang salah");
      }
      
      System.out.println("Gaji Anda Adalah :" +Gaji);
      
      //Penghitungan Gaji Lembur
      System.out.println ("Masukan Jam kerja");
      jamKerja = input.nextInt();
      
      if (jamKerja == 1) {
        gajiLembur = Gaji * 0.30;
      }
      else if (jamKerja == 2) {
        gajiLembur = Gaji * 0.32;
      }
      else if (jamKerja == 3) {
        gajiLembur = Gaji * 0.34;
      }
      else if (jamKerja == 4) {
        gajiLembur = Gaji * 0.36;
      }
      else if (jamKerja >= 5) {
        gajiLembur = Gaji * 0.38;
      }
      else {
        gajiLembur = 0;
      }
      System.out.printf("Gaji Lembur Anda Adalah : % .0f%n",  gajiLembur);
      
      //menghitung total Gaji
      totalGaji = Gaji + gajiLembur;
      System.out.printf("Total Gaji Anda Adalah : % .0f%n", totalGaji);
      System.out.println("============SELESAI==============");
      }
      }
      

