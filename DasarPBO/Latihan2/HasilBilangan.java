package javaapplication2.DasarPBO.Latihan2;

import java.util.Scanner;

public class HasilBilangan {
    public static void main(String[] args) {
        bilangan s = new bilangan();
        Scanner scan = new Scanner(System.in);
         System.out.print("Masukkan nomor absen : ");
         int absen = scan.nextInt();
         s.bilangan(absen, absen);
    }
}
