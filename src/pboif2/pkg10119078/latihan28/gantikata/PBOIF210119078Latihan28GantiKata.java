/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menganti kata 
 *
 */
package pboif2.pkg10119078.latihan28.gantikata;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String kalimat,ganti,jadi;
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("=====Program Mengganti Kata=====");
         System.out.println("");
         System.out.printf("Masukan kalimat: ");
         kalimat = scanner.nextLine();
         
         System.out.printf("Ganti kata: ");
         ganti = scanner.next();
         
         System.out.printf("Menjadi kata: ");
         jadi = scanner.next();
         
         String kalimatBaru = kalimat.replace(ganti , jadi);
         System.out.println("=======Hasil Formatting=======");
         System.out.println("Kalimat awal: " + kalimat);
         System.out.println("Kalimat baru: " + kalimatBaru);
    }
    
}
