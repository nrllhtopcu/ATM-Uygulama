package com.application.atm.islemler;

import com.application.atm.musteriler.Musteriler;

import java.util.Scanner;

public class Login {


    static Scanner input = new Scanner(System.in);

    public static String musteriNoGir(){
        String musteriNo;
        while (true){
            musteriNo = input.nextLine();
            if(Musteriler.musteriListesi().containsKey(musteriNo)){
                Musteriler.musteriListesi().get(musteriNo).yazdir();
                break;
            }
            else {
                System.out.println("Böyle bir müşteri bulunmamaktadır. \n" +
                        "Lütfen varolan bir müşteri no giriniz.");
            }
        }

        return musteriNo;
    }
}
