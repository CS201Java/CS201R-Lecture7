import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello and welcome!");
        
        //SAMPLE ARRAY: CREATING A 2D ARRAY AS AN ARRAY OF ARRAYS
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
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);


        //CREATING A 2D ARRAY AND FINDING THE SUMM OF ALL VALUES IN THE 1ST COLUMN
        int[][] array2 = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;

        for (int i = 0; i < array2.length; i++)
            sum += array2[i][0];

        System.out.println(sum);


        //CREATE A 2D ARRAY
        Random rand = new Random();
        int[][] array3 = new int[3][4];
        int total = 0, largeCol = -1, largeTotal = 0;

        //assign random numbers to the array
        for (int r = 0; r < array3.length; r++) {
            for (int c = 0; c < array3[r].length; c++) {
                int value = rand.nextInt(99) + 1;
                array3[r][c] = value;
            }
        }

        //get total for each column. if current column total is largest, reset
        for (int c = 0; c < array3[0].length; c++){
            total = 0;
            for (int r = 0; r < array3.length; r++) {
                total += array3[r][c];
            }
            if (total > largeTotal){
                largeTotal = total;
                largeCol = c;
            }
        }

        //PRINT THE ARRAY & LARGEST COLUMN VALUE
        for (int r = 0; r < array3.length; r++) {
            for (int c = 0; c < array3[r].length; c++)
                System.out.print(array3[r][c] + " ");
            System.out.println();
        }
        System.out.println("Column: " + largeCol + " has the largest total: " + largeTotal);


        //randomly shuffle this array
        int r1, c1, hold;
        for (int r = 0; r < array3.length; r++){
            for (int c = 0; c < array3[0].length; c++) {
                r1 = rand.nextInt(array3.length);
                c1 = rand.nextInt(array3[0].length);
                hold = array3[r][c];
                array3[r][c] = array3[r1][c1];
                array3[r1][c1] = hold;
            }
        }

        for (int r = 0; r < array3.length; r++) {
            for (int c = 0; c < array3[r].length; c++)
                System.out.print(array3[r][c] + " ");
            System.out.println();
        }

        //CREATE A 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> array4 = new ArrayList<>();  

        try {
            //define file values
            File inFile = new File("data.txt");
            Scanner scanner = new Scanner(inFile);

            //input values from a file & add to array4
            if (loadArray(array4, scanner) == -1){
                System.out.println("Input is not valid");
            }
            scanner.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            return;
        }

    }

    public static int loadArray(ArrayList<ArrayList<Integer>> array4, Scanner input){

        String inputLine;
        int rowCount, colCount, row, col;
 
        while (input.hasNextLine()){
            //get the next line of input from the file
            inputLine = input.nextLine();
            String[] tokens = inputLine.split(" ");
            //check that the number of tokens includes row & colum
            if (tokens.length < 2){
                return -1;
            }   
            rowCount = Integer.parseInt(tokens[0]);
            colCount = Integer.parseInt(tokens[1]);

            if (tokens.length < rowCount*colCount){
                return -1;
            }            

            int tokenPos = 2;
            for (row = 0; row < rowCount; row++){
                ArrayList<Integer> rowValues = new ArrayList<Integer>();
                for (col = 0; col < colCount; col++){
                    rowValues.add(Integer.parseInt(tokens[tokenPos]));
                    tokenPos++;
                }
                array4.add(rowValues);
            }
       }
                   
        for (ArrayList<Integer> rowList : array4){
            for (Integer value : rowList)
                System.out.printf("%4d", value);
            System.out.println();
        }
       return 1;
    }
}

