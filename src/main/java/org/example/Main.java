package org.example;

import org.example.GeneriGarajPkg.GenericGaraj;
import org.example.GeneriGarajPkg.Kamyon;
import org.example.GeneriGarajPkg.Otomobil;
import org.example.GenericClass.Calisan;
import org.example.GenericClass.Mudur;
import org.example.GenericClass.Ogretmen;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setAname("navin");
        telusko.setColor("green");

        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();

        //Session session = new sf.openSession();
*/
        //LAMBDA EXPRESSIONS
        /* LAMBDA EXPERSSIONS
        Printable printable = s-> System.out.println("s = " + s);
        printable.print("oktay");

        Islem topla = (s1, s2)->s1+s2;
        System.out.println("topla.islem(4,6) = " + topla.islem(4, 6));

        Islem cikar = (s1,s2)-> s1-s2;
        System.out.println("cikar.islem(10,3) = " + cikar.islem(10, 3));

        Islem buyukSec = (s1,s2)->{
            if(s1>s2) return  s1;
            else if (s2>s1) return  s2;
            else return 0;
        };

        System.out.println("buyukSec.islem(20,12) = " + buyukSec.islem(-20, 12));
*/
        //GENERIC CLASSES

        Ogretmen ogretmen = new Ogretmen("Oktay");
        //System.out.println("ogretmen.getMaas(10) = " + ogretmen.getMaas(10));

        Mudur mudur = new Mudur("Zehra");
       // System.out.println("mudur.getMaas(10) = " + mudur.getMaas(10));


        Calisan<Ogretmen> OgretmenCalisan= new Calisan<>(ogretmen);
        System.out.println("getOgretmenMaas.getMaas(10) = " + OgretmenCalisan.getMaas(10));
        OgretmenCalisan.print();
        System.out.println("OgretmenCalisan.getSaatUcreti() = " + OgretmenCalisan.getSaatUcreti());

        System.out.println();
        Calisan<Mudur> MudurCalisan = new Calisan<>(mudur);
        System.out.println("getMudurMaas.getMaas(10) = " + MudurCalisan.getMaas(10));
        MudurCalisan.print();
        System.out.println("MudurCalisan.getSaatUcreti() = " + MudurCalisan.getSaatUcreti());

        GenericGaraj<Kamyon> kamyonGaraj = new GenericGaraj<>(2);
        GenericGaraj<Otomobil> otomobilGaraj = new GenericGaraj<>(2);
        Otomobil o1 = new Otomobil("Mercedes");
        Otomobil o2 = new Otomobil("Opel");
        Otomobil o3 = new Otomobil("Mazda");

        Kamyon k1 = new Kamyon("Ford");
        Kamyon k2 =  new Kamyon("Ikarus");

        kamyonGaraj.addGarajgeList(k1);
        kamyonGaraj.addGarajgeList(k2);

        otomobilGaraj.addGarajgeList(o1);
        otomobilGaraj.addGarajgeList(o2);
        otomobilGaraj.addGarajgeList(o3);

        List<Kamyon> kamyonlist = kamyonGaraj.getGarageList();
        List<Otomobil> otomobilList = otomobilGaraj.getGarageList();

        kamyonlist.stream().forEach(System.out::println);
        otomobilList.stream().forEach(System.out::println);
        System.out.println("----------------------------");
        kamyonGaraj.printGarageList();
        otomobilGaraj.printGarageList();

    }
}