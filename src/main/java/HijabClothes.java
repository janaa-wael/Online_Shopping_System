/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarah Tarek
 */

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public abstract class HijabClothes extends Products implements Offer {
    
    // constructors
    public HijabClothes(){
    }
    
    public HijabClothes(double price,int id, String color){
        super(price, id, color);
    }
    
    public HijabClothes(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate,String color){
        super(price, id, startOfferDate, endOfferDate, color);
    }
    
    // offer percentage
    @Override
    public double getOfferPercentage() {
        if(super.getPrice() >= 300 && super.getPrice() <= 500)
            return 0.1;
        else if (super.getPrice() >= 500 && super.getPrice() <= 700)
            return 0.2;
        else if (super.getPrice() >= 700 && super.getPrice() <= 1000)
            return 0.3;
        else if (super.getPrice() >= 1000 && super.getPrice() <= 1200)
            return 0.4;
        else if (super.getPrice() >= 1200 && super.getPrice() <= 1500)
            return 0.5;
        else
            return 0;
    }
    
    @Override
    public String toString() {
        List<Size> arr=Arrays.asList(Size.values());
        return super.toString() 
                +"\n"+"size: "+arr.get(0)+", "+arr.get(1)+", "+arr.get(2)+", "+arr.get(3)+", "+arr.get(4)+", "+arr.get(5)+", "+arr.get(6);
    }
}

