package com.gmail.slartua;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        ArrayList<Data> dataList = new ArrayList<>();


        dataList.add(new Data(1 , "C" ));
        dataList.add(new Data(1  ,"A" ));
        dataList.add(new Data(2 , "D" ));
        dataList.add(new Data(1 , "E" ));
        dataList.add(new Data(2 , "B" ));

        for(Data d: dataList) {
            System.out.println(d);
        }

        System.out.println("After sort");
        Collections.sort(dataList);

        for(Data d: dataList) {
            System.out.println(d);
        }

    }

}
