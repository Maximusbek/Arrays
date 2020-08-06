package com.jetbrains;
import java.util.Arrays;
public class InterestTable {
    public static void main(String[] args) {
        int[][] table = new int[10][6];
        for (int row = 0; row < 10; row++)
            for (int column = 0; column < 6; column++)
                table[row][column] = getBalance(1000.00, row + 1, (5 + 0.5 * column));
        System.out.println("Balance for Various Interest Rates " + "Compounded Annually");
        System.out.println("(Rounded to Whole Dollars Amounts)");
        System.out.println();
        System.out.println("Years 5.00% 5.50% 6.00% 6.50% " + "7%.00 7.50%");
        for (int row = 0; row < 10; row++)
        {
            System.out.println((row + 1) + " ");
            for (int column = 0; column < 6; column++)
                System.out.println("$" + table[row][column] + " ");
                System.out.println();

        }
    }


    public static int getBalance(double startBalance, int years, double rate) {
        double runninBalance = startBalance;
        for (int count = 1; count <= years; count++)
            runninBalance = runninBalance * (1 + rate / 100);
        return (int) (Math.round(runninBalance));
    }
}
/*int [][] data = {{12,4,5},{23,113,32}};
        for (int [] row:data){
            System.out.println("*******Row : ");
            for (int columnData : row){
                System.out.print(columnData + " " );
            }
            System.out.println();
        }
        // Declaring two dimensional Array
        int [] [] data1 = {{12,5,4},{23,113,32}};
        int [] [] data2 = {{6,15,14},{20,3,88}};
       // Storing above 2 variable to another array to make it 3 dimensional
       //int [][][] threeDArray = {data1,data2} ;
       // or
     int [][][] threeDArray = new int[12][15][88];
       threeDArray[0] = data1;
        threeDArray[1] = data2;

    }
}
*/

