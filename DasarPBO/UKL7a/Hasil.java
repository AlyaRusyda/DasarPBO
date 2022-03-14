package javaapplication2.DasarPBO.UKL7a;

import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        ID s = new ID();
        Tarif p = new Tarif();
        Scanner scan = new Scanner(System.in);
        System.out.print("ID Pelanggan : ");
        int id = scan.nextInt();
        s.ID(id, id);
        System.out.print("Jumlah Pemakaian : ");
        int jumlah = scan.nextInt();
        p.Tarif(jumlah, jumlah);
    }
}