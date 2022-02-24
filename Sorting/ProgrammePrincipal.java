package Sorting;

import java.sql.Array;
import java.util.Random;
import java.util.Timer;

public class ProgrammePrincipal {

    static int[] array;
    public static void main(String[] args) {

        generateArray(100000);
        SortMerge sort = new SortMerge();
         long startTime = System.currentTimeMillis();
         sort.divide(array);
         long estimatedTime = System.currentTimeMillis() - startTime;
         System.out.println("List sorted by merge in " + String.format("%.3f", (estimatedTime/1000.0f)) + " seconds");

         startTime = System.currentTimeMillis();
         sort.basicSort(array);
         estimatedTime = System.currentTimeMillis() - startTime;
         System.out.println("List sorted by for-loops in " + String.format("%.3f", (estimatedTime/1000.0f)) + " seconds");

         startTime = System.currentTimeMillis();
         sort.bubbleSort(array);
         estimatedTime = System.currentTimeMillis() - startTime;
         System.out.println("List sorted by bubble sort in " + String.format("%.3f", (estimatedTime/1000.0f)) + " seconds");

    }

    /**
     * This function generate the array to sort
     * @param length, length of the array
     */
    public static void generateArray(int length){
        Random random = new Random();
        array = new int[length];

        //loop that populate the array
        for(int i =0; i<length;i++){
            array[i] = random.nextInt(10) + 1;
        }
    }

    /**
     * This function show the array
     */
    public static void showArray(int[] array){
        System.out.print("[");
        for(int i = 0; i<array.length;i++){
            if(i == array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ", ");
            }


        }
        System.out.print("]");
        System.out.println();
    }

}
