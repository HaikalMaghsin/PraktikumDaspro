import java.util.Scanner;
public class nestedUjianSkripsi13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        String bebas_kompen; 
        
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        bebas_kompen = sc.nextLine().trim();
        System.out.println("Masukan jumlah log bimbingan Pembimbing 1: ");
        int pembimbing1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan Pembimbing 2: ");
        int pembimbing2 = sc.nextInt();
        sc.close();

        if (bebas_kompen.equalsIgnoreCase("Ya")) {
            if (pembimbing1 >= 8 && pembimbing2 >= 4) {
                pesan = "Mahasiswa boleh mengikuti ujian skripsi.";
            } else if (pembimbing1 < 8 && pembimbing2 < 4) {
                pesan = "Mahasiswa belum boleh mengikuti ujian skripsi, karena log bimbingan belum lengkap.";
            } else if (pembimbing1 < 8) {
                pesan = "Mahasiswa belum boleh mengikuti ujian skripsi, karena log bimbingan Pembimbing 1 belum lengkap.";
            } else {
                pesan = "Mahasiswa belum boleh mengikuti ujian skripsi, karena log bimbingan Pembimbing 2 belum lengkap.";
            }
        } else {
            pesan = "Mahasiswa belum boleh mengikuti ujian skripsi, karena masih ada kompen.";
        }
        System.out.println(pesan);
    }
}
