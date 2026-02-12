import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args){
        
        //SAMPLE ARRAY: CREATING A 2D ARRAY AS AN ARRAY OF ARRAYS
        System.out.println("2D ARRAYS:  EXAMPLE 1");
        int [][]array1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        for (int r = 0; r < array1.length; r++) {
            for (int c = 0; c < array1[r].length; c++)
                System.out.print(array1[r][c] + " ");
            System.out.println();
        }
        System.out.println("\narray1[1] =        " + Arrays.toString(array1[1]));
        System.out.println("array1.length =    " + array1.length);        
        System.out.println("array1[1].length = " + array1[1].length);  


        //CREATING A 2D ARRAY AND ADDING ROW 0 (THE CONTENTS OF X)
        int[][] array2 = new int[5][6];
        int[] x = {1, 2};
        array2[0] = x;
        System.out.println("\n2D ARRAYS:  EXAMPLE 2:  array2[0][1] is " + array2[0][1]);


        System.out.println("\n2D ARRAYS:  EXAMPLE 3");
        //CREATING A 2D ARRAY AND FINDING THE SUM OF ALL VALUES IN THE 1ST COLUMN
        int[][] array3 = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;

        for (int i = 0; i < array3.length; i++)
            sum += array3[i][0];

        System.out.println("\nThe sum of the values in the 0th columns: " + sum);


        System.out.println("\n2D ARRAYS:  EXAMPLE 4");
        int[][] array4 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
        int maxSum = 0;

        for (int i = 0; i < array4.length; i++){
            sum = 0;
            for (int j = 0; j < array4[i].length; j++){
                sum += array4[i][j];
            }
            if (sum > maxSum)
                maxSum = sum;
        }
        System.out.println("maxSum is: " + maxSum);

        System.out.println("\n2D ARRAYS:  YOU TRY IT");
        //YOU TRY IT:  CREATE A 2D ARRAY
        Random rand = new Random();
        int largeCol = 0, largeTotal = 0;
        //create the array
 
        //assign random numbers to the array


        //shuffle the elements of the array



        //get total for each column. if current column total is largest, reset


        //PRINT THE ARRAY & LARGEST COLUMN VALUE




        //print largest column # & value
        System.out.println("Column: " + largeCol + " has the largest total: " + largeTotal);


        System.out.println("\n\n2D ARRAYLISTS:  EXAMPLE 6");
        //CREATE A 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> array6 = new ArrayList<>();  
        ArrayList<Integer> row1a = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> row2a = new ArrayList<>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> row3a = new ArrayList<>(Arrays.asList(9,10,11,12));        
        array6.add(row1a);
        array6.add(row2a);
        array6.add(row3a);
        for (ArrayList<Integer> rowList : array6){
            for (Integer value : rowList)
                System.out.printf("%4d", value);
            System.out.println();
        }

        System.out.println("\n\n2D ARRAYLISTS:  EXAMPLE 7");
        //CREATE A 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> array7 = new ArrayList<>();  
        ArrayList<Integer> row1b = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> row2b = new ArrayList<>(Arrays.asList(8,7,6,5));
        ArrayList<Integer> row3b = new ArrayList<>(Arrays.asList(9,10,11,12));        
        array7.add(row1b);
        array7.add(row2b);
        array7.add(row3b);
        for (ArrayList<Integer> rowList : array7){
            for (Integer value : rowList)
                System.out.printf("%4d", value);
            System.out.println();
        }
        System.out.println("\nComparing row 0 of Array6 & Array7: " + array6.get(0).equals(array7.get(0)));
        System.out.println("Comparing row 1 of Array6 & Array7: " + array6.get(1).equals(array7.get(1)));
        System.out.println("Comparing Array6 & Array7:          " + array6.equals(array7));
        //Collections.sort(array6.get(1));
        Collections.sort(array6.get(1), Collections.reverseOrder());
        System.out.println("Comparing row 1 of Array6 & Array7: " + array6.get(1).equals(array7.get(1)));
        Collections.sort(array7.get(1), Collections.reverseOrder());
        System.out.println("Comparing Array6 & Array7:          " + array6.equals(array7));



        System.out.println("\n2D ARRAYLISTS:  EXAMPLE 8");
        //CREATE A 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> array8 = new ArrayList<>();  


        try {
            //define file values
            File inFile = new File("data.txt");
            Scanner scanner = new Scanner(inFile);
            FileWriter output = new FileWriter("output.txt");
            PrintWriter report = new PrintWriter(output);

            //input values from a file & add to array4
            if (loadArray(array8, scanner) == -1){
                System.out.println("Input is not valid");
            }
            else {
                for (ArrayList<Integer> rowList : array8){
                    for (Integer value : rowList){
                        System.out.printf("%4d", value);
                        report.printf("%4d", value);
                    }
                    report.println();
                    System.out.println();
                }
            }
            scanner.close();
            report.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            return;
        }
        catch (IOException e){
            System.out.println("An error occured during processing");
            return;
        }
        catch (Exception e){
            System.out.println("Exception occured during processing");
            return;
        }

    }

    public static int loadArray(ArrayList<ArrayList<Integer>> array, Scanner input){

        String inputLine;
        int rowCount = 0, colCount = 0, row = 0, col = 0;
 
        while (input.hasNextLine()){
            //get the next line of input from the file
            inputLine = input.nextLine();

            //split the input by spaces
            String[] tokens = inputLine.split(" ");

            //check that the number of tokens includes row & colum
            
            
            //set rowCount & colCount to tokens[0] & tokens[1]
 


            //check there is enough data in the input record

            


            //add logic to read in the remaining values in the input file







       }
                   
        for (ArrayList<Integer> rowList : array){
            for (Integer value : rowList)
                System.out.printf("%4d", value);
            System.out.println();
        }
       return 1;
    }
}