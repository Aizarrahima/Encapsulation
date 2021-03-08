package Latihan3;

public class TestSiswa {
    public static void main(String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Aizar");
        siswa.setAbsen(02);
        siswa.setAddress("Blitar");
        
        System.out.println("Name    : "+ siswa.getName());
        System.out.println("Absen   : "+ siswa.getAbsen());
        System.out.println("Address : "+ siswa.getAddress());
        
    }
}
