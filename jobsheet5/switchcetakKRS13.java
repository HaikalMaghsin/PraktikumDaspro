import java.util.Scanner;
public class switchcetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();
        sc.close();
        switch (semester) {
            case 1:
                System.out.println("KRS untuk semester 1 ditampilkan");         
                break;
            case 2:
                System.out.println("KRS untuk semester 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS untuk semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS untuk semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS untuk semester 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS untuk semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS untuk semester 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS untuk semester 8 ditampilkan");
                break;
            default:
                System.out.println("Semester tidak valid");
                break;  
        }
    }
}
