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
public class SegitigaKanan {
    public static void main (String[] args){
        Scanner jumlah = new Scanner(System.in);
        
        int n;
        
        System.out.println("\t\t\t\tMatriks Segitiga Rata Kanan");
        
        System.out.print("masukkan jumlah angka = ");
        n = jumlah.nextInt();
        
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n -i; ++j)
                System.out.print("  ");
            for(int k=1; k<=i; ++k){
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
    }
}
   