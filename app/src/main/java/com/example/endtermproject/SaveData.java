package com.example.endtermproject;

public class SaveData {
    static String name;
    static String num;
    static String psw;
    static String email;
    static int[] pdtsell =new int [12];
    static int[] price =new int[12];
    static String pdtName[] =new String[12];


    public static void setName(String s )
    {
        name=s;
    }
    public static void  setNum(String s )
    {
        num=s;
    }
    public static void  setPsw(String s )
    {
        psw=s;
    }
    public static void productInc(int a,String pr,String pdt)
    {
        pdtsell[a]++;
        price[a] =Integer.parseInt(pr);
        pdtName[a]=pdt;
    }

    public static void  setEmail(String s)
    {
        email=s;
    }
    public static String  getName()
    {
        return name;
    }
    public static int getQunty(int a)
    {
        return pdtsell[a];
    }
    public static String getPdtName(int a)
    {
        return pdtName[a];
    }
    public static int getPrice(int a)
    {
        return price[a];
    }

}
