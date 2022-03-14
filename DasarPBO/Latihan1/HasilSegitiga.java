package javaapplication2.DasarPBO.Latihan1;

import java.util.Scanner;

public class HasilSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai alas : ");
        int alas = scan.nextInt();
        System.out.print("Masukkan niali tinggi : ");
        int tinggi = scan.nextInt();
        s.LuasSegitiga(alas, tinggi);
        System.out.print("Masukkan sisi 1 : ");
        int sisi1 = scan.nextInt();
        System.out.print("Masukkan sisi 2 : ");
        int sisi2 = scan.nextInt();
        System.out.print("Masukkan sisi 3 : ");
        int sisi3 = scan.nextInt();
        s.KLSegitiga(sisi1, sisi2, sisi3);
    }
}
