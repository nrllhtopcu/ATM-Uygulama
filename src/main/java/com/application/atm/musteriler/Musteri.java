package com.application.atm.musteriler;

public class Musteri {

    private String tckimlikNo;
    private String musteriNo;
    private String adSoyad;
    private float bakiye;

    public Musteri(String tckimlikNo, String musteriNo, String adSoyad, float bakiye) {
        this.tckimlikNo = tckimlikNo;
        this.musteriNo = musteriNo;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
    }


    public String getTckimlikNo() {
        return tckimlikNo;
    }

    public void setTckimlikNo(String tckimlikNo) {
        this.tckimlikNo = tckimlikNo;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public float getBakiye() {
        return bakiye;
    }

    public void setBakiye(float bakiye) {
        this.bakiye = bakiye;
    }

    public void yazdir(){
        System.out.println("Ad Soyad: " + getAdSoyad() + "\n" +
                "TC Kimlik No: " + getTckimlikNo()+"\n" +
                "Hesap Bakiyesi: " + getBakiye());

    }


}
