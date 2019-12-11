package com.example.test;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import androidx.annotation.RequiresApi;

public class MainActivity extends Activity {

/*Start a new android project
add roboelectric, junit etc. libraries for unit testing (check online for tutorials on how to set this up) -- done

Write a class that has a method which accepts a list of numbers in random order. Example: {5,2,3,67,3,4,4,6,2,23,3,114}  -- Class is Utils, method is sortArrayManually done

The method should sort the numbers from lowest to highest and return the sorted list. The method can be static. -- sortArrayAscendingOrder done

Write a unit test that tests this method and makes sure that the numbers coming back are in fact from lowest to highest. -- done

In the existing class add a method that reverses the list from "lowest to highest" to "highest to lowest". -- done

Add a unit test to verify it is reversed -- done

You are not allowed to use exception handling. All possible exceptions need to be catered for in code using if statements and manual checks.*/

/*
________________________________________________________________________________________________________________________________________________________________________________________________

Create a class that accepts the following string in its constructor.

"Android is a mobile operating system based on a modified version of the Linux kernel and other open source software.
The latest android version is currently 10. It is designed primarily for touchscreen mobile devices such as smartphones and tablets.
Android is developed by a consortium of developers known as the Open Handset Alliance, with the main contributor and commercial marketer being Google."

Write a method in this class that returns the string but changes the first letter of each word to a capital letter.
-- done

Write a unit test to verify, using ascii, that each word in the string returned from that class starts with a capital letter.
-- done

Write a method in the class that accepts two strings as parameters.
The method should replace the 1st and 3rd instance of the first string being passed in with the 2nd parameter.
So if I have a sentence like "one, two, one, one, three". The method should return, if the parameters are "one" and "test",  "test, two, one, test, three"
--

Write unit tests to test both methods. Be careful of using circular logic.

You are not allowed to use exception handling. All possible exceptions need to be catered for in code using if statements and manual checks.
________________________________________________________________________________________________________________________________________________________________________________________________


Write code that displays the string passed in and updates the string every 3 seconds by changing lower case to upper case and uppercase to lower case.

Write code that displays a list of numbers and then sorts the numbers every 3 seconds from high to low or low to high or randomises them
 */

    private static TextView textView;
    private static int counter;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onResume() {
        super.onResume();
//        int[] array = {99, 1,-8 ,-3 ,999, 2, 98, 55, 66, 34, 23, 1, 3, 6};
//        String stringValue = "";
//        for(int val : array) {
//            stringValue += val + ", ";
//        }
//        Log.d("To Sort", stringValue);
//        sortArrayManually(array, true);
        replaceFirstAndThirdCharWithInputString("TA TE TA TE TA TE","TA","X");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        //changeStringCasePeriodfically("bulana");
    }

    public static void populateWithRandomnNumbers(int[] arrayList) {
        Random randomNumber = new Random();
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = randomNumber.nextInt(arrayList.length);
        }
    }

    public static int[] sortArrayManually(int[] arrayList, boolean ascending) {
        if(arrayList == null) {
            return null;
        }

        int[] array = arrayList;
        for (int i = 0; i < array.length; i++) {

            Log.d("outer loop i : ",""+i);
            String stringValue = "";
            for(int tmp : array) {
                stringValue += tmp + ", ";
            }

            Log.d("Sort", stringValue);
            for (int j = i + 1; j < array.length; j++) {
                Log.d("loop i : ",""+i);
                Log.d("loop j : ",""+j);
                Log.d("array[i] : ",""+array[i]);
                Log.d("array[j] : ",""+array[j]);
                Log.d("array[j] : ",""+(array[i] > array[j]));

                if(ascending) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;

                        String stringValue2 = "";
                        for (int tmp : array) {
                            stringValue2 += tmp + ", ";
                        }
                        Log.d("Sort2", stringValue2);
                    }
                }
            }
        }

        String stringValue = "";
        for(int tmp : array) {
            stringValue += tmp + ", ";
        }
        Log.d("Sort", stringValue);

        return array;
    }
//
//    public static int[] sortArrayDescending(int[] arrayList) {
//        int[] tempArray = new int[arrayList.length];


//        String stringValue = "";
//        for(int tmp : arrayList) {
//            stringValue += tmp + ", ";
//        }
//        Log.d("To Sort", stringValue);
        //select element
        //loop through array list and check if element is > next element.
        //if true swap
        //if false ignore
        //use two loops
        //98, 1, 2, 99
        //if element index changes keep that in mind when replacing with next element
//        return arrayList;

//    }

//    public static int[] sortArrayAscendingOrder(int[] unsortedArray) {
//        return sortArrayManually(unsortedArray);
//    }

    // {0, 1, 2, 3, 4, 5}
    // {5, 4, 3, 2, 1, 0}

    public static int[] reverseArrayMoo(int[] array) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - 1 - i];
        }
        return temp;
    }

    public static int[] reverseArray(int[] unSortedArray) {
        for(int i=0; i<unSortedArray.length/2; i++){
            int temp = unSortedArray[i];
            unSortedArray[i] = unSortedArray[unSortedArray.length -i -1];
            unSortedArray[unSortedArray.length -i -1] = temp;
        }
        return unSortedArray;
    }

    public static void swap(int temp, int toSwapWith) {
        temp = toSwapWith;
        temp = temp;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String firstCharsToCapitalLetter(String toCapitalizeString) {
        String[] strArray = toCapitalizeString.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = toUpperCaseFirstChar(strArray[i]);
        }
        toCapitalizeString = String.join(" ", strArray);
        return toCapitalizeString;
    }

    public static String toUpperCaseFirstChar(String string) {
        char[] array = string.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String replaceFirstAndThirdCharWithInputString(String str, String firstString, String secondString) {
        String[] strArray = str.split(" ");
        int count = 0;
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i] == firstString) {
                count++;
            }
            if(counter == 3) {
                for(int j = 0; j < strArray.length; j++) {
                    if(strArray[j] == firstString) {
                        strArray[j] = secondString;
                    }
                }
                continue;
            }
        }

        strArray[0] = firstString;
        strArray[2] = secondString;
        Log.d("OK",""+String.join(",", strArray));
        return String.join(",", strArray);
    }

//    public static void changeStringCasePeriodfically(final String stringToChangeCase) {
//        Timer timer  = new Timer();
//        timer.schedule(new TimerTask() {
//            int counter = 0;
//            @Override
//            public void run() {
//                Log.d("NKO",""+counter);
//                if(counter%2 == 0) {
//                    //Log.d("NKO",stringToChangeCase.toUpperCase());
//                    //stringToChangeCase.toUpperCase();
//                    Log.d("NKOS",""+counter);
//                    textView.setText(stringToChangeCase.toUpperCase());
//                    counter++;
//                }
//                else {
//                    //Log.d("NKOS",stringToChangeCase.toUpperCase());
//                    //stringToChangeCase.toLowerCase();
//                    textView.setText(stringToChangeCase.toLowerCase());
//                    Log.d("NKO",""+counter);
//                    counter++;
//                }
//            }
//        },0, 3000);
//    }
}
