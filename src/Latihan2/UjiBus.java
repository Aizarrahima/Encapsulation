package Latihan2;

public class UjiBus {
    public static void main (String[] arg) {
        
        //membuat objek busBesar dari class Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15); //menambahkan 15 peenumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5); //menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();
    }
}
