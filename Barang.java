public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Constructor
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Menampilkan informasi barang
    public void tampilkanInfo() {
        // Menggunakan metode String.format untuk menampilkan harga dengan 2 angka desimal
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang: Rp" + String.format("%.2f", hargaBarang)); // Format angka menjadi string
    }
}
