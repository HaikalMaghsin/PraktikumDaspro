import java.util.Scanner;
public class ifcetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah dibayar? (true/false):");
        boolean uktDibayar = sc.nextBoolean();
        sc.close();

        if (uktDibayar) {
            System.out.println("pembayaran UKT sudah lunas.");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA.");
        } else {
            System.out.println("Registrasi ditolak. silahkan lakukan pembayaran UKT terlebih dahulu.");
        }
    }
}