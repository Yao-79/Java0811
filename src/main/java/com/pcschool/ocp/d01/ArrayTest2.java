package com.pcschool.ocp.d01;

public class ArrayTest2 {
    public static void main(String[] args) {
        double stocks[]={7.6,3.9,15.6,28.3,1.2,10.8,35.3,45.6,10.2,0.5};
        double bounds[]={6.8,7.2,6.8,7.5,6.9,7.9,7.9,7.1,7.2};
        
        double sum,sum2=0;
        
        for(int i=0,j=0;i<stocks.length,j<bounds.length;i++,j++){
            sum=sum+stocks[i];
            sum2=sum2+bounds[i];
        }       
        double avg=sum/stocks.length;
        System.out.printf("股票平均為: %.2f",avg);
    }

}

