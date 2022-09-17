package org.example.GenericClass;

public class Calisan<T extends Personel>{

    T calisan;

    int Master;
    int Master1;

    public Calisan(T calisan) {
        this.calisan = calisan;
    }

    public int getMaas(int calismaSaati){
        return calisan.saatUcreti*calismaSaati;
    }

    public void print(){
        System.out.println(calisan.name+" ->"+calisan.saatUcreti);
    }

    public int getSaatUcreti(){
        return calisan.saatUcreti;
    }
}
