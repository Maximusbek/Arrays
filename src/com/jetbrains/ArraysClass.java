package com.jetbrains;
import java.util.Arrays;
public class ArraysClass {
    public static void main(String[] args) {
        /* int [] intArray = {2,5,7,1,3};
         // Syntax for sorting Array elements
        Arrays.sort(intArray);
        for (int item: intArray) {
            System.out.println("numbers " + item);

            // Getting String value of Array items

        }
        int [] numbers = {2,15,7,1,3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //    Sorting String Array
        String [] names = {"John","Adam","Don"};
        Arrays.sort(names);
        for (String item:names) {
            System.out.println("names " +item);*/

        int [] num = {2,5,7,14};
        Arrays.sort(num);
        System.out.println(Arrays.binarySearch(num,2));
        System.out.println(Arrays.binarySearch(num,5));
        System.out.println(Arrays.binarySearch(num,9));
        System.out.println(Arrays.binarySearch(num,19));

        }
    }

