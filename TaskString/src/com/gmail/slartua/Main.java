package com.gmail.slartua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String one = "aBc sdd";
        String two = "aBc sdd";

        System.out.println(checkReposition(one, two));

    }

    public static boolean checkReposition(String one, String two){

        List<Character> charListOne = new ArrayList<Character>();
        for(char c : one.toCharArray()){
            charListOne.add(c);
        }

        List<Character> charListTwo = new ArrayList<Character>();
        for(char c : two.toCharArray()){
            charListTwo.add(c);
        }

        if(charListOne.size()==charListTwo.size()){
            for(int i = 0; i < charListOne.size(); i++){
                for(int j = 0; j < charListTwo.size(); j++){
                    if (charListOne.get(i) == charListTwo.get(j)){
                        charListTwo.remove(j);
                        break;
                    }
                }
            }
            return charListTwo.isEmpty();
        } else return false;
    }
}
