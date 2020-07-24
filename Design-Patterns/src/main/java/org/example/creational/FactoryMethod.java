package org.example.creational;
import java.io.*;

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int unitsRecorded){
        System.out.print("BILL : ");
        System.out.println(unitsRecorded*rate);
    }
}

class DomesticPlan extends Plan{
    public void getRate(){
        rate = 3.75;
    }
}
