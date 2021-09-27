package com.application.atm.musteriler;

public class BireyselMusteri extends Musteri {

    private String evAdresi;

    public BireyselMusteri(String tckimlikNo, String musteriNo, String adSoyad, float bakiye, String evAdresi) {
        super(tckimlikNo, musteriNo, adSoyad, bakiye);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public void yazdir() {
        super.yazdir();
        System.out.println("Ev Adresi: " +getEvAdresi());
    }







}
