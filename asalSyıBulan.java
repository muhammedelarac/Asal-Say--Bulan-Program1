import java.util.Scanner;
/**
 * asalSyıBulan
 */
public class asalSyıBulan {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int sayi=input.nextInt();
        asal(sayi,2);
    }
    static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.print(sayi + " asal sayıdır.");
            return;
        } else if (sayi%i == 0) {
            System.out.print(sayi + " asal sayı değildir.");
            return;
        }

        asal(sayi, i + 1);

    }
}


/*Sayı Giriniz : 22
22 sayısı ASAL değildir !


Sayı Giriniz : 2
2 sayısı ASALDIR !


Sayı Giriniz : 39
39 sayısı ASAL değildir !


Sayı Giriniz : 17
17 sayısı ASALDIR */