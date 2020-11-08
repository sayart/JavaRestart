package com.gmail.slartua;

public class Data implements Comparable<Object>{
    private int number;
    private String name;

    public Data(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "number=" + number +
                ", name=" + name +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Data entry =(Data) o;
        int result = number -((Data) o).number;
        if (result != 0 )
            return (int) result / Math.abs(result);

        result = name.compareTo(entry.name);
        if(result != 0)
            return result;
        return 0;

    }
}
