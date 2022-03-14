package javaapplication2.DasarPBO.Tambahan;

import java.util.Scanner;

class buatObjek{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Angka");
        
        int angka=scan.nextInt();
        System.out.println("============================");
        
        System.out.println("Masukkan Nilai A");
        int a=scan.nextInt();
        System.out.println("MAsukkan nilai B");
        int b=scan.nextInt();
        bilangan bil=new bilangan();
        bil.ganjilGenap(angka);
        
        System.out.println("Hasil Penjumlahan:"+bil.hitungPemjumlahan(a, b));
    }
}