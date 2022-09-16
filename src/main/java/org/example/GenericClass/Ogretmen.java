package org.example.GenericClass;

public class Ogretmen extends Personel {//implements MaasHesapla
   private int saatUcretiOgretmen =50;
    public Ogretmen(String name) {
        super(name);
        this.saatUcreti=saatUcretiOgretmen;
    }
/*
    @Override
    public int getMaas(int calismaSaati) {
        return this.saatUcreti*calismaSaati;
    }

 */
}
