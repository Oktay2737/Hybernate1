package org.example.GeneriGarajPkg;

import java.util.ArrayList;
import java.util.List;

public class GenericGaraj<T extends I_Arac>{

    private List<T> garageList = new ArrayList<>();
    private int garageLimit;

    public GenericGaraj(int garageLimit) {
        this.garageLimit = garageLimit;
    }


    public void addGarajgeList(T arac){
        if(garageList.size()<garageLimit){
            System.out.println("garajdaki arac sayısı :"+garageList.size());
            System.out.println(arac.getClass().getName().substring(18)+" Garage  added");
            garageList.add(arac);
        }else {
            System.out.println(arac.getClass().getName().substring(18)+" Garage is full");
        }
    }
    public List<T> getGarageList(){
        return garageList;
    }

    public void printGarageList(){
        garageList.stream().forEach(System.out::println);
    }
}
