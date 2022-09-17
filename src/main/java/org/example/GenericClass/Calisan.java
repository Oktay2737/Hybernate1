package org.example.GenericClass;

public class Calisan<T extends Personel>{

    T calisan;

    int commit1;
    int commit2;
    int commit3;
    int b2commit1;

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
