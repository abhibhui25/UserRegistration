package com.cg.findmaximum;
import java.util.ArrayList;
import java.util.Collections;

public class MaxGeneric<T> {
    T a;
    T b;
    T c;

    public static <T extends Comparable<T>> T testMaximum(T... elements)
    {   T max=elements[0];
        ArrayList <T> array=new ArrayList();
        for(T e:elements) {
            array.add(e);
        }
        Collections.sort(array);
        return array.get(array.size()-1);
    }

    public static void main(String[] args) {

        MaxGeneric g=new MaxGeneric();
    }
}
