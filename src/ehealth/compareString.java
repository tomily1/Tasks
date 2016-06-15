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
public class compareString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String out = find_charsN("logic", "gate");
        System.out.println(out);
        String out2 = find_charsNN("logic", "gate");
        System.out.println(out2);
    }
    
    
    private static String find_charsNN(String first, String second) {
        String testString =first;
        String testString2 =second;
        char[] string1 = testString.toCharArray();
        char[] string2 = testString2.toCharArray();
        String match = "";
        for (char output : string1){
            for(char output2:string2){
                if(output == output2){
                    match += output;
                }
            }
        }
       
        return match;
}
    
    private static String find_charsN(String first, String second) {
        String testString =first;
        String testString2 =second;
        char[] charFirst = testString.toCharArray();
        char[] charSecond = testString2.toCharArray();
        String MatchN  = "";
        
        for (int x = 0; x<charFirst.length; x++){
            for(int y = 0;y<charSecond.length;y++){
                if (charFirst[x] == charSecond[y]){
                    MatchN += charFirst[x];
                    charFirst[x] = 0;
                    break;
                    
                
                }
            }
            }
        return MatchN;
    }
    
}
