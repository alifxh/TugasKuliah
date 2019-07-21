package classstatistik;

import java.util.Scanner;
public class ClassStatistik {

    //Buat class Maximum, Minimum dan Range
    
    void MaxMinRan(){
        //untuk MaxMin
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan ukuran data : ");
        int b = in.nextInt();
        int []a = new int[b];
        
        System.out.println("Masukkan angka nya : ");
        
        //looping ukuran data yang di masukkan
        for(int i=0; i<b; i++){
            a[i]=in.nextInt();
        }
        
        System.out.println(" ");
        //untuk menampilkan hasil data yang dimasukkan
        for (int j=0; j<b; j++){
            System.out.println("Angka ke " + (j + 1) + " : " + a[j]);
        }
        
        //perhitungan untuk maksimum
        int iMax = a[0];
        for(int i=1; i<b; i++){
            if(iMax < a[i]){
                iMax=a[i];
            }
        }
        
        //perhitungan untuk Minimum
        int iMin = a[0];
        for(int i=1; i<b; i++){
            if(iMin > a[i]){
                iMin=a[i];
            }
        }
        
        //Menampilkan hasil Max dan Min
        System.out.println("Nilai maksimalnya adalah : " + iMax);
        System.out.println("Nilai Minimumnya adalah : " + iMin);
        
        // Mencari Range
        int Range;
        Range = iMax - iMin;
        System.out.println("Range nya adalah : "+ Range);
    }
    
    //Mencari nilai rata-rata
    void Mean(){
        Scanner in = new Scanner(System.in);
        int a, nilai[];
        float rata, jumlah = 0;
        
        System.out.println("Masukkan jumlah angka : ");
        a = in.nextInt();
        
        nilai = new int[a];
        
        //Input angkanya
        for (int i=0; i<=a-1; i++){
            System.out.print("Angka ke : " + (i+1) + ":");
            nilai[i] = in.nextInt();
        }
        
        //Menghitung jumlahnya
        for(int j=0; j<=a-1; j++){
            jumlah = jumlah + nilai[j];
        }
        
        //Menghitung rata-rata
        rata = jumlah/a;
        
        //Outputnya
        System.out.println("List Angkanya : ");
        System.out.println("Nilai rata-ratanya adalah : " + rata);
    }
    
    //Standart Deviasi
    void StanDev(){
        int a;
        float[] b;
        float total=0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Masukkan banyaknya angka : ");
        a = read.nextInt();
        
        b = new float[a];
        
        for(int i=0; i<a; i++){
            System.out.println(" Angka Ke " + (i+1) + " : ");
            b[i] = read.nextInt();
            total += b[i];
        }
        float ab = total/a;
        total = 0;

        for (int i=0; i<a; i++)
            total += (b[i]-ab)*(b[i]-ab);
        float cd = (float) Math.sqrt(total)/a;

        System.out.println("Standart Deviasinya : " + cd);
        
    }
    
    //Pengurutan Data
    void Urut(){
        int a, b;
        float[] c;
        float min, abc;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Masukkan banyaknya angka : ");
        a = read.nextInt();
        c = new float[a];
        
        for(int i=0; i<a; i++){
            System.out.println("Angka ke" + (i+1) + ": ");
            c[i] = read.nextInt();
        }
        
        System.out.println("Angka sebelum di urutkan : ");
        for(int i=0; i<a; i++)
            System.out.print(c[i] + " ");
        System.out.println();
        for (int i=0; i<a; i++){
            min = c[i];
            b = i;
            for (int j=i+1; j<a; j++)
                if (min > c[j]){
                    min = c[j];
                    b = j;
                }
            abc = c[i];
            c[i] = c[b];
            c[b] = abc;
        }
        System.out.println("Data Setelah diurutkan : ");
        for (int i=0; i<a; i++)
            System.out.print(c[i] + " ");
    }
    
    //Membuat class Median
    void Median(){
        Scanner in = new Scanner(System.in);
        int banyak, temp, jumlah = 0;
        int data[];
        
        System.out.print("Banyak Data : ");
        banyak = in.nextInt();
        data = new int[banyak];
        for (int i=0; i<=banyak-1;i++){
            System.out.print("Data ke-"+(i+1)+" : ");
            data[i]=in.nextInt();
        }
        
        System.out.println("Data sudah di urutkan : ");
        for(int i=0; i<=banyak-1; i++){
            System.out.print(data[i]+ " ");
            jumlah = jumlah + data[i];
        }
        
        int bil = banyak / 2;
        if(bil==0){
            int posisi = banyak / 2;
            System.out.println("Datanya Genap ");
            double median = ((data[posisi] + data[posisi+1]) / 2);
            System.out.printf("mediannya = %.2f", median);
        }
        else{
            int posisi = (banyak + 1) / 2;
            System.out.println("Data Ganjil");
            double median = data[posisi-1];
            System.out.printf("Mediannya = %.2f", median);
        }
    }
    
    //Modulus
    void Modulus(){
        int a, b;
        float hasil;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        a = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        b = in.nextInt();
        
        hasil = a%b;
        System.out.println("Hasil modulus adalah : " + hasil);
    }
    
    public static void main(String[] args) {
        //Memanggil class
        Scanner baca = new Scanner(System.in);
        System.out.println("Pilih 1 angka untuk menghitung opsi berikut :");
        System.out.println("1. Maximum, Minimum dan Range");
        System.out.println("2. Mean (Rata-rata)");
        System.out.println("3. Standart Deviasi");
        System.out.println("4. Urut");
        System.out.println("5. Median");
        System.out.println("6. Modulus");
        System.out.println("Masukkan angka : ");
        int ba = baca.nextInt();
        
        if(ba==1){
            ClassStatistik cs = new ClassStatistik();
            cs.MaxMinRan();
        }
        else if(ba==2){
            ClassStatistik cs = new ClassStatistik();
            cs.Mean();
        }
        else if(ba==3){
            ClassStatistik cs = new ClassStatistik();
            cs.StanDev();
        }
        else if(ba==4){
            ClassStatistik cs = new ClassStatistik();
            cs.Urut();
        }
        else if(ba==5){
            ClassStatistik cs = new ClassStatistik();
            cs.Median();
        }
        else if(ba==6){
            ClassStatistik cs = new ClassStatistik();
            cs.Modulus();
        }
        else{
            System.out.println("Coba lagi");
        }
    }
    
}
