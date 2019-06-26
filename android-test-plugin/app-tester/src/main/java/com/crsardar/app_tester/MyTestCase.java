package com.crsardar.app_tester;

import android.util.Log;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class MyTestCase
{
    @Rule
    public TestName name = new TestName();

    @Test
    public void testA()
    {
        Log.d("CHITTA", "Name of testA() = " + name.getMethodName());

        Assert.assertEquals("testA", name.getMethodName());
    }

    @Test
    public void testB()
    {
        Log.d("CHITTA", "Name of testB() = " + name.getMethodName());

        Assert.assertEquals("testB", name.getMethodName());
    }
}
