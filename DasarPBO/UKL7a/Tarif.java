package javaapplication2.DasarPBO.UKL7a;

public class Tarif {
    public void Tarif(int golongan, int jumlah){
      int hasil = 0;
      if(golongan == 1){
        hasil = jumlah * 1000;
      } else if (golongan == 2){
        hasil = jumlah * 1300;
      } else {
        hasil = jumlah * 1500;
      }
      
       int bayar = hasil;
        if (bayar < 50000){
            bayar = 50000;
        }
        
        int total = bayar + 13000;
        System.out.println("Jumlah Tagihan : Rp " + total);
    }
}
