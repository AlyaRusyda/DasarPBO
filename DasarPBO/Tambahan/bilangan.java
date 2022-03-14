package javaapplication2.DasarPBO.Tambahan;

public class bilangan {
    public void bilangan(int absen) {
        
        for (int i = 0; i < absen; i+=2) {//i=i+5
            
        }
    }
    
    public int hitungPemjumlahan(int a,int b){
        int hasil=a+b;
        return hasil;
    }
    
    public void ganjilGenap(int angka){
        
        if(angka%2==0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
