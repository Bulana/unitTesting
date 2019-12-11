package com.example.test;

import android.os.Build;
import java.util.Arrays;
import java.util.Random;

import androidx.annotation.RequiresApi;

public class Utils {

//    @RequiresApi(api = Build.VERSION_CODES.O)
//    public static void main(String[] args) {
//        int[] myArray = new int[10];
//
//        //System.out.println("Unsorted randomly generated Array\n");
//        populateWithRandomnNumbers(myArray);
//        for (int i = 0; i < myArray.length; i++) {
//            //System.out.println(myArray[i]);
//        }
//
//        //System.out.println("\nSort using Arrays Class\n");
//        arraySortUsingArrayClass(myArray);
//        for (int i = 0; i < myArray.length; i++) {
//            //System.out.println(myArray[i]);
//        }
//
//        //String str = new String("Android is a mobile operating system based on a modified
//        // version of the Linux kernel");
//        //System.out.println(str+"\n");
//        // firstCharsToCapitalLetter(str);
//        String str = new String("one, two, three, four");
//        str = replaceFirstAndThirdCharWithInputString(str, "ones", "tests");
//        System.out.println(str);
//
//    }

    public static void populateWithRandomnNumbers(int[] arrayList) {
        Random randomNumber = new Random();
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = randomNumber.nextInt(arrayList.length);
        }
    }

    public static void arraySortUsingArrayClass(int[] arrayList) {
        Arrays.sort(arrayList);
    }

    public static void arraySortManually(int[] arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            for (int j = 0; j < arrayList.length - i - 1; j++) {
                if (arrayList[j] > arrayList[j + 1]) {
                    swap(arrayList[j], arrayList[j + 1]);
                }
            }
        }
    }

    public static void swap(int temp, int toSwapWith) {
        temp = toSwapWith;
        temp = temp;
    }

    //        public static void ascendingOrder() {
    //        }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void capitalizeWholeString(String str) {
        String[] strArray = str.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = capitalizeFirstCharacter(strArray[i]);
        }
        str = String.join(" ", strArray);
        System.out.print(str);
    }

    public static String capitalizeFirstCharacter(String string) {
        char[] array = string.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String replaceFirstAndThird(String str, String firstString, String secondString) {
        String[] strArray = str.split(",");
        strArray[0] = firstString;
        strArray[2] = secondString;
        return String.join(", ", strArray);
    }
}

