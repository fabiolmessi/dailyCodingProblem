/*
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
*/
import java.util.*;

public class Problem{

     public static void main(String []args){
        int A[]={10,15,3,7};
        Arrays.sort(A);
        int i=0;
        int j=A.length-1;
        int k=17;
        
        while(true){
            if(A[i]+A[j]>k){
                j--;
            }else if(A[i]+A[j]<k){
                i++;
            }else{
                break;
            }
        }
        System.out.println("k:"+k+"="+A[i]+"+"+A[j]);
     }
}
/*
 complexity worst case O(n)
*/
