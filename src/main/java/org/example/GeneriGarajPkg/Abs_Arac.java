package org.example.GeneriGarajPkg;

public abstract class Abs_Arac {

    public String marka;

    public Abs_Arac(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                '}';
    }
}
