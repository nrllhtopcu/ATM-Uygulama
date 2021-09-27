package com.application.atm.musteriler;

import java.util.HashMap;

public class Musteriler {

    public static Musteri bireyselMusteri1(){
        return new BireyselMusteri("13320032846","123123423", "Nurullah TOPCU" , 7000.0f ,"Subaşı Mahallesi");
    }
    public static Musteri bireyselMusteri2(){
        return new BireyselMusteri("17236746964","176392847" , "Tahsin TOPCU" , 5000.21f , "Subaşı Mahallesi" );
    }

    public static Musteri bireyselMusteri3(){
        return new BireyselMusteri("14346584720","276391825" , "Ahmet AKSU" , 9000.28f, "Dereli Mahallesi");
    }

    public static Musteri kurumsalMusteri1(){
        return new KurumsalMusteri("15329783642","746243826" , "Ozan EKİCİ" , 8000.0f, "EKİCİHolding");
    }

    public static Musteri kurumsalMusteri2(){
        return new KurumsalMusteri("19847154728","123456789" ,"Oğuzhan TAŞ" , 11000.29f, "TAŞHolding");
    }


    public static HashMap<String, Musteri> musteriListesi(){
        HashMap<String, Musteri> musteriHashMap =new HashMap<String, Musteri>();
        musteriHashMap.put(Musteriler.bireyselMusteri1().getMusteriNo(), Musteriler.bireyselMusteri1());
        musteriHashMap.put(Musteriler.bireyselMusteri2().getMusteriNo(), Musteriler.bireyselMusteri2());
        musteriHashMap.put(Musteriler.bireyselMusteri3().getMusteriNo(), Musteriler.bireyselMusteri3());
        musteriHashMap.put(Musteriler.kurumsalMusteri1().getMusteriNo(), Musteriler.kurumsalMusteri1());
        musteriHashMap.put(Musteriler.kurumsalMusteri2().getMusteriNo(), Musteriler.kurumsalMusteri2());
        return musteriHashMap;
    }
}
