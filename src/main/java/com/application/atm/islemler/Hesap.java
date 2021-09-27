package com.application.atm.islemler;

import com.application.atm.musteriler.Musteri;

import static com.application.atm.islemler.Login.input;

public class Hesap {

    public static void paraYatir(Musteri musteri) {
        System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
        float tutar = input.nextFloat();
        float bakiye = musteri.getBakiye();
        if (tutar < 0) {
            System.out.println("Lütfen pozitif bir değer giriniz.");
        } else {
            musteri.setBakiye(bakiye + tutar);
        }

        System.out.println("Güncel Bakiyeniz: " + musteri.getBakiye());
    }

    public static void paraCek(Musteri musteri) {
        System.out.println("Çekmek istediğiniz tutarı giriniz: ");
        float tutar = input.nextInt();
        float bakiye = musteri.getBakiye();

        if (tutar > bakiye) {
            System.out.println("Yetersiz Bakiye..\n");
        } else if (tutar < 0) {
            System.out.println("Lütfen pozitif bir değer giriniz.");
        } else {
            musteri.setBakiye(bakiye - tutar);
        }
        System.out.println("Güncel Bakiyeniz: " + musteri.getBakiye());

    }


    public static void islemSec(Musteri musteri) {
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                "1- Para Yatırma \n" +
                "2- Para Çekme");

        String islem = input.nextLine();

        switch (islem) {
            case "1":
                Hesap.paraYatir(musteri);
                break;
            case "2":
                Hesap.paraCek(musteri);
                break;

        }

    }
}