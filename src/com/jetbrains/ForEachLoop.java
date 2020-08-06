package com.jetbrains;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] ints = {1,2,3,4,5,6,6,7,8,8,9,};
        for (int item: ints){

            if (item%2==0)
                System.out.println( "even number "+item);
        }
        String [] str = {"aaa", "bbb", "cafd"};
        for (String letters: str){
            if (letters.contains("b")) {
                System.out.print(" b is found getting out ");
                break;
            }
            System.out.print(letters + " ");
        }
        // Now we are going to use for loop;
        for (int i = 0; i < str.length; i++){
            String letters = str[i];
            System.out.println(letters);
        }
        for (int i = 0; i < str.length; i++){
            str[i] = "item" + i;
            System.out.println("new value " +i+" " + str[i]);
        }
    }
}
