package com.crsardar.app_tester;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SubInstrumentedTest extends SuperInstrumentedTest
{
    static
    {
        Log.d("CHITTA", "This is 'static' bloc of " + SubInstrumentedTest.class.getSimpleName());
    }

    @Before
    public void befTest(){
        Log.d("CHITTA", "This is 'beforeTest' method of " + SubInstrumentedTest.class.getSimpleName());
    }

    @Test
    public void myTest()
    {
        Log.d("CHITTA", "This is a test in " + SubInstrumentedTest.class.getSimpleName());
    }
}
