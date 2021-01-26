package com.epam.prejap.ess.helpers.arraysprintsortsearch;

import java.util.Arrays;

public class Helper {
//        How to search and sort and print an array,

    public static void main(String[] args) {
        String[] ultimateQuestion = new String[]{"how", "many", "roads", "must", "a", "man", "walk", "down"};
        int[] ints = new int[]{42, 3, 8, 0, 1, 2};

        //printing
        System.out.println("Values in the ultimate question: " + Arrays.toString(ultimateQuestion));
        //Sort must be called before binarySearch called otherwise it will not return the proper value
        System.out.println("Unsorted int array with search called for 2: " + Arrays.binarySearch(ints, 2));

        //sorting
        Arrays.sort(ints);

        //searching
        System.out.println("Location of 2 after sort is: " + Arrays.binarySearch(ints, 2));
    }
}
