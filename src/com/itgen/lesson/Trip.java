package com.itgen.lesson;

import java.util.Arrays;

public class Trip {
    private final int spends_daily;
    private String fio;
    private int spends_transport;
    private int days;

    public Trip(int spends_daily, String fio, int spends_transport, int days) {
        this.spends_daily = spends_daily;
        this.fio = fio;
        this.spends_transport = spends_transport;
        this.days = days;
    }

    public Trip(){
        this.spends_daily = 5;
        this.fio = "Alexey Vasilyevich Pupkin";
        this.spends_transport = 15;
        this.days = 7;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSpends_transport() {
        return spends_transport;
    }

    public void setSpends_transport(int spends_transport) {
        this.spends_transport = spends_transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotal(){
        return spends_transport+spends_daily*days;
    }

    public void toStrings(){
        System.out.println(fio + ";" + (spends_transport/100 + "." + spends_transport%100) + ";" + (spends_daily/100 + "." + spends_daily%100) + ";" + days);
    }


}
