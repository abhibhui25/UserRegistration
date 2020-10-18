package com.cg.findmaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximum {
    FindMaximum m=new FindMaximum();
    MaxGeneric gen=new MaxGeneric();
    Integer a,b,c,p;
    Float d,e,f,q;
    String g,h,i,r;

    @Before
    public void initialValues(){
        a=10;
        b=5;
        c=2;
        p=1;
        d=5.0f;
        e=3.0f;
        f=1.0f;
        q=0.5f;
        g="Abhishek";
        h="Bhui";
        i="blr";
        r="India";
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
    @Test
    public void givenFloats_IfMaxAtPosition3_ShouldPass(){
        Assert.assertSame(m.maxFloat(e,f,d),d);
    }
    @Test
    public void givenStrings_IfMaxAtPosition1_ShouldPass(){
        Assert.assertSame(m.maxString(g,h,i),i);
    }
    @Test
    public void givenStrings_IfMaxAtPosition2_ShouldPass(){
        Assert.assertSame(m.maxString(h,g,i),i);
    }
    @Test
    public void givenStrings_IfMaxAtPosition3_ShouldPass(){
        Assert.assertSame(m.maxString(h,i,g),i);
    }
    @Test
    public void givenGenerics_IfMaxAtPosition1_ShouldPass() {
        Assert.assertSame(m.maxGeneric(a, b, c), a);
    }

    @Test
    public void givenGenerics_IfMaxAtPosition2_ShouldPass() {
        Assert.assertSame(m.maxGeneric(e, d, f), d);
    }

    @Test
    public void givenGenerics_IfMaxAtPosition3_ShouldPass() {
        Assert.assertSame(m.maxGeneric(h,i,g), i);
    }
    @Test
    public void givenGenerics_IfGenericMaxClass1_ShouldPass() {
        Assert.assertSame(gen.testMaximum(a,b,c,p),a);
    }
    @Test
    public void givenGenerics_IfGenericMaxClass2_ShouldPass() {
        Assert.assertSame(gen.testMaximum(d,e,f,q),d);
    }
    @Test
    public void givenGenerics_IfGenericMaxClass3_ShouldPass() {
        Assert.assertSame(gen.testMaximum(g,h,i,r),i);
    }
}
