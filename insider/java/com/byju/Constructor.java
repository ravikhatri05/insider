package com.byju;

public class Constructor {
    static String str;
    public void Constructor(){
        str ="123232";
        System.out.println("IN");

    }

    public static void main (String arg[]){

        Constructor c = new Constructor();
        System.out.println(str);
    }
}
