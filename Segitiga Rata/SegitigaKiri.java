/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algodanprog;

/**
 *
 * @author Baymax
 */
import java.util.Scanner;
public class SegitigaKiri {
    public static void main (String[] args) {
        Scanner jumlah = new Scanner(System.in);
        
        int n;
        
        System.out.println("\t\t\t\tMatriks Segitiga Rata Kiri");
        
        System.out.print("masukkan jumlah angka = ");
        n = jumlah.nextInt();
        System.out.println("");
        
        for (int i=n; i>=1; --i){
            for(int j=1; j<=i; ++j){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
