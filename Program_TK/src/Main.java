import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMurid = 0;
        boolean validInput = false;

        // Error handling untuk input jumlah murid
        while (!validInput) {
            try {
                System.out.print("Masukkan jumlah murid TK: ");
                jumlahMurid = scanner.nextInt();
                scanner.nextLine();  // Konsumsi newline
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("____________________________________________________________________________");
                System.out.println("| Input tidak valid, silakan masukkan angka yang benar untuk jumlah murid. |");
                System.out.println("____________________________________________________________________________");
                scanner.nextLine();  // Konsumsi newline yang tidak valid
            }
        }

        // Array untuk menyimpan objek TK
        TK[] murid = new TK[jumlahMurid];

        // Perulangan untuk input data murid TK
        for (int i = 0; i < jumlahMurid; i++) {
            String nama = "";
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan nama murid ke-" + (i + 1) + ": ");
                    nama = scanner.nextLine();
                    if (nama.trim().isEmpty() || !nama.matches("[a-zA-Z\\s]+")) {
                        System.out.println("___________________________________________________");
                        throw new IllegalArgumentException("| Nama tidak boleh kosong dan harus berupa huruf. |");
                    }
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            int usia = 0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan usia murid ke-" + (i + 1) + ": ");
                    usia = scanner.nextInt();
                    scanner.nextLine();  // Konsumsi newline
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("____________________________________________________________________");
                    System.out.println("| Input tidak valid, silakan masukkan angka yang benar untuk usia. |");
                    System.out.println("____________________________________________________________________");
                    scanner.nextLine();  // Konsumsi newline yang tidak valid
                }
            }

            String idMurid = "";
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan ID murid ke-" + (i + 1) + ": ");
                    idMurid = scanner.nextLine();
                    if (idMurid.trim().isEmpty() || !idMurid.matches("\\d+")) {
                        System.out.println("___________________________________________________");
                        throw new IllegalArgumentException("ID Murid tidak boleh kosong dan harus berupa angka.");
                    }
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Membuat objek TK dan memasukkannya ke array
            murid[i] = new TK(nama, usia, idMurid);
        }

        // Seleksi dan perulangan untuk menampilkan data murid yang berusia di atas 4 tahun
        System.out.println("\nMurid TK yang berusia di atas 4 tahun:");
        boolean ditemukan = false;
        for (TK muridTK : murid) {
            if (muridTK.getUsia() > 4) {
                muridTK.tampilkanInfo();
                System.out.println();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada murid TK yang berusia di atas 4 tahun.");
        }

        scanner.close();
    }
}
