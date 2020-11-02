package com.gmail.slartua;


import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Calendar cl = Calendar.getInstance();
       Calendar cl2 = Calendar.getInstance();

       cl2.set(Calendar.MONTH, cl.get(Calendar.MONTH) - 1);
        Date date1 = cl.getTime();
        Date date2 = cl2.getTime();

        long time = date1.getTime() - date2.getTime();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(time + " ms");



    }


}
