import java.util.Random;
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

        System.out.println(sum);


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


        System.out.println("2D ARRAYLISTS:  EXAMPLE 1");
        //CREATE A 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> array4 = new ArrayList<>();  

        try {
            //define file values
            File inFile = new File("data.txt");
            Scanner scanner = new Scanner(inFile);
            FileWriter output = new FileWriter("output.txt");
            PrintWriter report = new PrintWriter(output);

            //input values from a file & add to array4
            if (loadArray(array4, scanner) == -1){
                System.out.println("Input is not valid");
            }
            else {
                for (ArrayList<Integer> rowList : array4){
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

    public static int loadArray(ArrayList<ArrayList<Integer>> array4, Scanner input){

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
                   
        for (ArrayList<Integer> rowList : array4){
            for (Integer value : rowList)
                System.out.printf("%4d", value);
            System.out.println();
        }
       return 1;
    }
}

