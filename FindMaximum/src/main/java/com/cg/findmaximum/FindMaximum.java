package com.cg.findmaximum;

public class FindMaximum {
    public Integer maxInteger(Integer a,Integer b,Integer c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }
    public Float maxFloat(Float a,Float b,Float c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }
    public String maxString(String a,String b,String c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        if(b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        System.out.println("welcome");
        FindMaximum max=new FindMaximum();
    }
}
