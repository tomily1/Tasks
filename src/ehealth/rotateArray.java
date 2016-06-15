/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealth;

/**
 *
 * @author ZION
 */
public class rotateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int [] array = {1, 2, 3, 4, 5, 6};
       arrayRotation(array,2);
       for(int i = 0;i<array.length;i++)
        System.out.println(array[i]);
    }
    private static void arrayRotation(int [] array, int N){
        if (array==null || N<0){
            System.out.print("array must not be empty"
                    + " or the position must not be negative.i.e enter a positive "
                    + "value for N ");
        }
        else{
        int startPoint = array.length-N;
        if(startPoint>0){
            int[] arrayCopy = array.clone();
            for(int x=0; x<array.length;x++){
                int y = (x+startPoint)%array.length;
                array[x] = arrayCopy[y];
            }
        }
        }
       
    }
}
