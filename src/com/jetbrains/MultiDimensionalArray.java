package com.jetbrains;

public class MultiDimensionalArray{
        public boolean firstLastChar(String word) {
            int firstIndex = word.charAt(0);
            char firstChar = word.charAt(firstIndex);
            int lastIndex = word.length()-1;
            char lastChar = word.charAt(lastIndex);
            boolean result = firstChar == lastChar;
            return result;

        }

        public static void main(String[] args) {

            UtilityMethods um = new UtilityMethods();
            boolean result2 = um.firstLastChar("pum");
            System.out.println(result2);
        }
}




