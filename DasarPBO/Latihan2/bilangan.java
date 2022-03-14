package javaapplication2.DasarPBO.Latihan2;

public class bilangan {
    //menampilkan bilangan 0-4
    int absen, a;

    public void bilangan(int absen, int a){
        for (a = 0; a <= absen; a++){
            if(a >= 0){
                System.out.println(a);
            }
        }
    }
}
