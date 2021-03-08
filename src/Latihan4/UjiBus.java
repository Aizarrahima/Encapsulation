package Latihan4;

public class UjiBus {
    public static void main(String[] abc){
        Bus3 Bus = new Bus3(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(1); //tambah 1 penumpang
        Bus.cetakPenumpang();
        ///penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        ///penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
    }
}
