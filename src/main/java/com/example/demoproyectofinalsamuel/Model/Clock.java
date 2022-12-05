package com.example.demoproyectofinalsamuel.Model;

import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock implements Runnable{
    String hours,minutes,seconds,ampm;
    Thread h1;
    Text reloj;
    public Clock(Text reloj){
        this.reloj=reloj;
        h1=new Thread(this);
        h1.start();

    }

    @Override
    public void run() {
        Thread ct=Thread.currentThread();
        while (ct==h1){
            calculate();
            reloj.setText(hours+":"+minutes+":"+seconds+":"+ampm);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
    private void calculate(){
        Calendar calendar1=new GregorianCalendar();
        Date date=new Date();
        calendar1.setTime(date);
        ampm=calendar1.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

        if (ampm.equals("PM")){
            int h=calendar1.get(Calendar.HOUR_OF_DAY)-12;
            hours=h>9?""+h:"0"+h;//si la hora es menor a 9 se agrega un 0

        }else {
            hours=calendar1.get(Calendar.HOUR_OF_DAY)>9?""+calendar1.get(Calendar.HOUR_OF_DAY):"0"+calendar1.get(Calendar.HOUR_OF_DAY);
        }
        minutes=calendar1.get(Calendar.MINUTE)>9?""+calendar1.get(Calendar.MINUTE):"0"+calendar1.get(Calendar.MINUTE);
        seconds=calendar1.get(Calendar.SECOND)>9?""+calendar1.get(Calendar.SECOND):"0"+calendar1.get(Calendar.SECOND);

    }
}

