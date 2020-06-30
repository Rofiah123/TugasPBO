public class Main {
    public static void main(String[] args) {
        //instance / pembuatan objek dari class
        //namaClass namaObjek = new constructor()
        Dosen dosen = new Dosen();

        dosen.id = 1;
        dosen.nama = "Rofiah";
        dosen.nik = "18630230";
        dosen.nilai = 4.1;
        dosen.alamat = "Martapura";
        dosen.tampilData();

        Dosen dosen1 = new Dosen(2, "hery", "18632435",3.1, "banjarbaru");
        dosen1.tampilDataDenganGaris( "------------------------");

        double hasilReturnValue = dosen.getNilai();
//        System.out.println("Hasil return value : " + hasilReturnValue);

//        dosen.tampilDataDenganGaris("=========================");
//        dosen.tampilDataDenganGaris("*************************");
//        dosen.hitungLuasPersegiPanjang(5,3);
//        dosen.hitungLuasPersegiPanjang( 7,3);
//        dosen.hitungLuasPersegiPanjang( 8,4);
//        dosen.hitungLuasPersegiPanjang( 9,2);

    }
}
