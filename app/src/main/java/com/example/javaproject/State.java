package com.example.javaproject;

public class State {
    private String name;
    private String capital;
    private int flag;

    public State (String name, String capital, int flag){
        this.name = name;
        this.capital = capital;
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    public String getCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setName(String name) {
        this.name = name;
    }
}
