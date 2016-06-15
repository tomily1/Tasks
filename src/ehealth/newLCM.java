package ehealth;

/**
 *
 * @author ZION
 */
public class newLCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {2,3,5,7};
        int d = lowestCommonMultiple(a);
        System.out.println(d);
    }
    private static int lowestCommonMultiple(int a[]){
        int lowestCommonMultiple=1;
        boolean possible=true;
        int i =1;
        while(true){
           
            for (int j=0;j<a.length;j++){
                if(i % a[j] != 0){
                    possible = false;
                    break;
                }
                 possible = true;
            }
            if(possible){
                lowestCommonMultiple = i;
                break;
            }
            i++;
        }
        return lowestCommonMultiple;
    }
    }
    

