
package algodanprog;

import java.util.Scanner;
public class Deret {
    public static void main (String[] args) {
        Scanner suku =  new Scanner(System.in);
        Scanner beda = new Scanner(System.in);
        Scanner awal = new Scanner(System.in);
        
        for(int i=1; i==1;){
            int n, Un, a, b;
            
            System.out.println("\t\t\t\tDeret");
            System.out.println("\tMenghitung Nilai dari Suku ke-n");
            System.out.print("Masukkan suku pertama (a) =");
            a = awal.nextInt();
            System.out.print("Masukkan nilai beda (b) =");
            b = beda.nextInt();
            System.out.print("masukkan banyak suku (n) =");
            n = suku.nextInt();
            
            Un=(a+(n-1)*b);
            
            System.out.println("Un="+a+"+ (" +n+"-" +1+ ") *" +b);
            System.out.println(Un);
            
        }
    }
}
