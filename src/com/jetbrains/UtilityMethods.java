package com.jetbrains;

public class UtilityMethods {
            public boolean firstLastChar(String word) {
            char firstChar = word.toLowerCase().charAt(0);
            int lastIndex = word.length()-1;
            char lastChar = word.toLowerCase().charAt(lastIndex);
            boolean result = firstChar == lastChar;
            return result;
        }
        public static void main(String[] args) {
            UtilityMethods um = new UtilityMethods();
            boolean result2 = um.firstLastChar("tablet");
            System.out.println(result2);
            String finalResult = um.initials("james gosling");
            System.out.println(finalResult);
        }
        public String initials(String name) {
            String firstChar = name.substring(0,1).toUpperCase(); // String position = info.substring(comma+2);
            int space = name.charAt(' ');
            String lastChar = name.substring(space+2);
            String finall = lastChar.substring(space,1);
            String firstLast = firstChar + lastChar;
            return firstLast;
        }
}





