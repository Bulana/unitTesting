package com.example.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static com.example.test.MainActivity.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {

    @Before
    public void setUp() throws Exception {
    }

//    @Test
//    public void sortArrayAscendingOrderTest() {
//        int[] unSortedArray = {4, 3, 1, 6, 0, 8, 12, 99, -1};
//        int[] sortedArray = {-1, 0, 1, 3, 4, 6, 8, 12, 99};
//        assertArrayEquals(sortedArray, sortArrayManually(unSortedArray));
//    }

//    @Test
//    public void reverseArrayTest() {
//        int[] unReversedArray = {1, 2, 3, 4};
//        int[] reversedArray = {4, 3, 2, 1};
//        assertArrayEquals(reversedArray, sortArrayAscendingOrder(unReversedArray));
//
//        int[] unReversedArray1 = {4, 3, 2, 1};
//        int[] reversedArray1 = {1, 2, 3, 4};
//        assertArrayEquals(reversedArray1, sortArrayAscendingOrder(unReversedArray1));
//    }

    @Test
    public void firstCharToCapitalLetterTest() {
        String word = firstCharsToCapitalLetter("pay with zapper");
        assertEquals("Pay With Zapper", word);
    }

    @Test
    public void replaceFirstAndThirdCharWithInputStringTest() {
        String stringToChange = "one, two, three, four";
        stringToChange = replaceFirstAndThirdCharWithInputString(stringToChange, "replaced first", "replaced second");
        assertEquals("replaced first, two,replaced second, four", stringToChange);
    }

    @Test
    public void arraySortManuallyTest() {
        int[] unSortedArray = {-12, 4, 3, 1, 200, 900, 0, -7, 13};
        int[] sortedArray = {-12, -7, 0, 1, 3, 4, 13, 200, 900};
        assertEquals(null, sortArrayManually(null, false));
        //assertArrayEquals(sortedArray, sortArrayManually(unSortedArray));
        assertArrayEquals(sortedArray, sortArrayManually(unSortedArray, true));
    }


    @Test
    public void arrayReverseTest() {
        int[] unSortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sortedArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertArrayEquals(sortedArray, reverseArrayMoo(unSortedArray));
    }

//    public static String changeStringCasePeriodficallyTest() {
//        return "";
//    }
}
