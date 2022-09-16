package org.example.GenericClass;

public class Mudur extends Personel {//implements MaasHesapla

    private int saatUcretiMudur=100;
    public Mudur(String name) {
        super(name);
        this.saatUcreti=saatUcretiMudur;
    }
/*
    @Override
    public int getMaas(int calismaSaati) {
        return calismaSaati*saatUcreti;
    }

 */
}
