import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk memastikan Scanner ditutup otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            // Login
            boolean isLoggedIn = false;
            while (!isLoggedIn) {
                System.out.println("+---------------------------------------------+");
                System.out.print("Username : ");
                String username = scanner.nextLine();
                System.out.print("Password : ");
                String password = scanner.nextLine();
                System.out.print("Captcha  : ");
                String captcha = generateCaptcha(); // Menghasilkan captcha
                System.out.println("Masukkan Captcha : " + captcha);
                String inputCaptcha = scanner.nextLine();
                System.out.println("+---------------------------------------------+");

                // Validasi login
                if (username.equals("asyifa123") && password.equals("23456") && captcha.equals(inputCaptcha)) {
                    System.out.println("Login berhasil!");
                    isLoggedIn = true;
                } else {
                    System.out.println("Login gagal! Silakan ulangi.");
                }
            }

            // Tampilkan salam dan tanggal waktu
            System.out.println("Selamat Datang di Supermarket Kenangan");
            String currentDateTime = getCurrentDateTime(); // Memanggil metode untuk tanggal & waktu
            System.out.println("Tanggal dan Waktu: " + currentDateTime);

            // Input data transaksi
            System.out.println("+---------------------------------------------+");
            System.out.print("No. Faktur  : ");
            String noFaktur = scanner.nextLine();
            System.out.print("Kode Barang : ");
            String kodeBarang = scanner.nextLine();
            System.out.print("Nama Barang : ");
            String namaBarang = scanner.nextLine();
            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Jumlah Beli : ");
            int jumlahBeli = scanner.nextInt();
            scanner.nextLine(); // Menangkap newline setelah input integer
            System.out.print("Nama Kasir  : ");
            String namaKasir = scanner.nextLine();

            // Menghitung total transaksi
            double total = hargaBarang * jumlahBeli;

            // Tampilkan informasi transaksi
            System.out.println("+---------------------------------------------+");
            System.out.printf("No. Faktur  : %s%n", noFaktur);
            System.out.printf("Kode Barang : %s%n", kodeBarang);
            System.out.printf("Nama Barang : %s%n", namaBarang);
            System.out.printf("Harga Barang: Rp%,.2f%n", hargaBarang);
            System.out.printf("Jumlah Beli : %d%n", jumlahBeli);
            System.out.printf("TOTAL       : Rp%,.2f%n", total);
            System.out.printf("Kasir       : %s%n", namaKasir);
            System.out.println("+---------------------------------------------+");
            System.out.println("Terima kasih telah berbelanja di Supermarket Kenangan!");
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Metode untuk menghasilkan captcha
    private static String generateCaptcha() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            captcha.append(characters.charAt(randomIndex));
        }
        return captcha.toString();
    }

    // Metode untuk mendapatkan tanggal dan waktu saat ini
    private static String getCurrentDateTime() {
        Date date = new Date(); // Objek Date untuk waktu saat ini
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Format tanggal & waktu
        return formatter.format(date);
    }
}

