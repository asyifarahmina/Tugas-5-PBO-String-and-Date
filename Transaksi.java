public class Transaksi extends Barang {
    private final String noFaktur; // Nomor faktur transaksi
    private final int jumlahBeli; // Jumlah barang yang dibeli
    private double total; // Total harga transaksi

    // Constructor
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    // Menghitung total harga transaksi
    public void hitungTotal() {
        // Perhitungan langsung dengan variabel dari superclass
        total = hargaBarang * jumlahBeli;
    }

    // Menampilkan informasi transaksi
    public void tampilkanTransaksi(String namaKasir) {
        System.out.println("+---------------------------------------------+");
        System.out.println("No. Faktur  : " + noFaktur);
        tampilkanInfo(); // Memanggil metode dari superclass untuk informasi barang
        System.out.println("Jumlah Beli : " + jumlahBeli);

        // Menggunakan String.format untuk memformat angka total menjadi bentuk mata uang
        System.out.println("TOTAL       : Rp" + String.format("%.2f", total));
        System.out.println("Kasir       : " + namaKasir);
        System.out.println("+---------------------------------------------+");
    }
}

