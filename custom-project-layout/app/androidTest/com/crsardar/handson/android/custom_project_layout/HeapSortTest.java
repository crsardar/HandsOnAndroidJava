package com.crsardar.handson.android.custom_project_layout;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class HeapSortTest<T> {

    private final int TEST_SIZE = 15;
    private final int NO_TESTS = 15;

    @Test
    public void mainTest() {

        for (int n = 0; n < NO_TESTS; n++) {

            Integer[] intArr = getRandomFilledArray();

            System.out.println("\n----------- Before : ");
            for (int i = 0; i < TEST_SIZE; i++) {

                System.out.print(intArr[i] + " ");
            }

            Comparator<Integer> comparator = (a, b) -> a - b;

            HeapSort<Integer> heapSort = new HeapSort();
            intArr = heapSort.sort(intArr, comparator);

            System.out.println("\nAfter : ");
            for (int i = 0; i < TEST_SIZE; i++) {

                System.out.print(intArr[i] + " ");
            }

            for (int i = 0; i < TEST_SIZE - 1; i++) {

                Assert.assertTrue(comparator.compare(intArr[i], intArr[i + 1]) < 1);
            }
        }
    }

    private Integer[] getRandomFilledArray() {

        Random random = new Random();
        int low = 10;
        int high = 100;

        Integer[] intArr = new Integer[TEST_SIZE];

        for (int i = 0; i < TEST_SIZE; i++) {

            intArr[i] = new Integer(random.nextInt(high - low) + low);
        }

        return intArr;
    }


    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldUpdateTextAfterButtonClick() {

        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.text)).check(matches(withText("Hello World!")));

        try
        {
            XmlSerializer xmlSerializer =  XmlPullParserFactory.newInstance().newSerializer();
        }
        catch (XmlPullParserException e)
        {
            e.printStackTrace();
        }
    }
}
