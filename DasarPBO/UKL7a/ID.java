package javaapplication2.DasarPBO.UKL7a;

public class ID {
    int golongan, id;
    public void ID(int golongan, int id){
    String data[][] = {
        {" ", " ", " "},
        {"1", "Galuh", "1", "Sawojajar"},
        {"2", "Indro", "3", "Kedungkandang"},
        {"3", "Jedi", "2", "Ijen"},
        {"4", "Ranu", "3", "Dinoyo"}
    };
        golongan = 0;
        if (id < 1 || id > data.length){
            System.out.println("ID Pelanggan tidak ada");
        } else {
            golongan =  Integer.parseInt(data[id][2]);
        }
    System.out.println("Nama Pelanggan : " + data[id][1]);
    System.out.println("Golongan : " + data[id][2]);
    System.out.println("Alamat : " + data[id][3]);
    }
}
