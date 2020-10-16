package com.cg.findmaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximum {
    FindMaximum m=new FindMaximum();
    Integer a,b,c;
    Float d,e,f;
    String g,h,i;

    @Before
    public void initialValues(){
        a=10;
        b=5;
        c=2;
        d=5.0f;
        e=3.0f;
        f=1.0f;
        g="Abhishek";
        h="Bhui";
        i="blr";
    }
    @Test
    public void givenIntegers_IfMaxAtPosition1_ShouldPass(){
        Assert.assertSame(m.maxInteger(a,b,c),a);
    }
    @Test
    public void givenIntegers_IfMaxAtPosition2_ShouldPass(){
        Assert.assertSame(m.maxInteger(b,a,c),a);
    }
    @Test
    public void givenIntegers_IfMaxAtPosition3_ShouldPass(){
        Assert.assertSame(m.maxInteger(b,c,a),a);
    }
    @Test
    public void givenFloats_IfMaxAtPosition1_ShouldPass(){
        Assert.assertSame(m.maxFloat(d,e,f),d);
    }
    @Test
    public void givenFloats_IfMaxAtPosition2_ShouldPass(){
        Assert.assertSame(m.maxFloat(e,d,f),d);
    }
}
