package com.pcschool.ocp.d01;

public class BMI {
    public String name;
    public double h;
    public double w;
    private double bmi;
    
    public double getBMI(){
        return bmi;
    }
    
    //設定 BMI 的方法
    public void setBMI(){
        bmi = w/Math.pow(h/100, 2);
        
    }
}
