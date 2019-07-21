
package algodanprog;

import java.util.Scanner;
public class AlgodanProg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double suhuawal, celcius, reamur, fahrenheit, kelvin;
        
        System.out.println("\t\t\t\t*Konverter Suhu*\n\n");
        System.out.print("Masukkan suhu (Dalam Celcius) = ");
        suhuawal = input.nextDouble();
        System.out.println("Nomor\tCelcius\t\tReamur\t\tFahrenheit\t\tKelvin");
        
        for (int i=1; i<=10; i++)
        {
            celcius=(suhuawal*i);
            reamur=((suhuawal*i)*0.8);
            fahrenheit=((suhuawal*i)*1.8+32);
            kelvin=((suhuawal*i)+273.15);
            
            System.out.println(i + "\t" + celcius + "\t\t" + reamur + "\t\t" + fahrenheit + "\t\t" + kelvin);
        }
    }
    
}
