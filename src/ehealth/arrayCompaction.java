/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealth;
import java.util.Arrays;
/**
 *
 * @author ZION
 */
public class arrayCompaction {
public static void main(String[] args) {
        // TODO code application logic here
        int [] array = {1, 3, 7, 7, 8, 9, 9, 9, 10};
        Arrays.sort(array);
        System.out.print("Inputted Array: [ ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"  ");
        System.out.println("]");
        System.out.println("\n\n");
        array = compactArray(array);
        System.out.print("Transformed Array: [ ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"  ");
        System.out.println("]");
    }



    private static int [] compactArray(int [] inputtedArray){
        if (inputtedArray.length < 2)
            return inputtedArray;
        
        int i=0;
        int j=1;
        
        while(j<inputtedArray.length){
            if(inputtedArray[j] == inputtedArray[i]){ //if there is a duplicate i.e A[1] equals A[0], jump to the next arrayay i.e if A[1] equals A[0] go to A[2] and compare again
                j++;
        }
            else{
                i++; //increment i for A[i] if its not equal to A[j]
                inputtedArray[i] = inputtedArray[j]; //2nd duplicate A[i] equals A[j] or same value e.g A[2] = A[2]
                j++; //increment j for A[j]
            }
                
        }
        int [] compactedArray = Arrays.copyOf(inputtedArray,i+1); // creates a new arrayay using the java.util.Arrays class with arrayay length up to the point where non duplicated arrayay objects stops 
        
        return compactedArray;
    }
    
}