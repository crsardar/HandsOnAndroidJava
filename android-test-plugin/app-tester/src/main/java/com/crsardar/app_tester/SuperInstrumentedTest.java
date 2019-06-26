package com.crsardar.app_tester;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SuperInstrumentedTest
{

    static
    {
        Log.d("CHITTA", "This is 'static' bloc of " + SuperInstrumentedTest.class.getSimpleName());
    }

    @Before
    public void beforeTest(){
        Log.d("CHITTA", "This is 'beforeTest' method of " + SuperInstrumentedTest.class.getSimpleName());
    }

    public void myTest()
    {
        Log.d("CHITTA", "This is a test in " + SuperInstrumentedTest.class.getSimpleName());
    }
}
