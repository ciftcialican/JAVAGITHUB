package PatikaArraylar;

import java.util.Arrays;
import java.util.Scanner;

public class Dizilerortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("dizinizin boyutunu belirleyiniz:");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("boyutunuz kadar sayı giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("girilen " + (i + 1) + ". değer:");
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));


    }
}
