package a9_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print(" Kart numarasını giriniz : ");
        String cardNumber = input.next();

        System.out.print(" Son kullanım tarihini giriniz : ");
        String date = input.next();

        System.out.print(" Güvenlik  kodunu giriniz : ");
        String cvc = input.next();


        System.out.println(" 1. A bankası");
        System.out.println(" 2. B bankası");
        System.out.println(" 3. C bankası");
        System.out.print(" Banka seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1 :
                Abankasi aPos = new Abankasi("A Bankası" , "0000" , "123");
                aPos.connect("127.1.1.1");
                aPos.payment(price , cardNumber , date , cvc);
                break;
            case 2 :
                Bbankasi bPos = new Bbankasi("B Bankası" , "1111" , "456");
                //bPos.conn("dsgdsg");
                //  bPos.sendPayment(1000);
                break;
                default:
                    System.out.println(" Geçerli banka giriniz !!");
        }








    }
}
