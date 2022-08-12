/**
 * BuyukKucukYakınSayı
 */
import java.util.Scanner;
import java.util.Arrays;

public class BuyukKucukYakınSayı {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        
        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.print("Girilen Sayı : ");
        int sayi = scan.nextInt();
        Arrays.sort(dizi);
        int kucuk = dizi[0];
        int buyuk = dizi[0];
        for(int i : dizi){
            if (i < sayi){
                
                kucuk = i; 
            }
            if(i > sayi){
                buyuk = i ;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + kucuk);
        System.out.println("Girilen sayıdan Büyük en yakın sayı : " + buyuk);


    }
}