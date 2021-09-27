package com.application.atm;

import com.application.atm.islemler.Hesap;
import com.application.atm.islemler.Login;
import com.application.atm.musteriler.Musteriler;

public class ATM {
    public static void main(String[] args) {

        System.out.println("Müşteri No Giriniz: ");
        String musteriNo = Login.musteriNoGir();
        Hesap.islemSec(Musteriler.musteriListesi().get(musteriNo));

    }
}
