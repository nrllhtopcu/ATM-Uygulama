package com.application.atm.musteriler;

public class KurumsalMusteri extends Musteri {

    private String sirketAdi;

    public KurumsalMusteri(String tckimlikNo, String musteriNo, String adSoyad, float bakiye, String sirketAdi) {
        super(tckimlikNo, musteriNo, adSoyad, bakiye);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void yazdir() {
        super.yazdir();
        System.out.println("Sirket Adi: " + getSirketAdi());
    }
}
