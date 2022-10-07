import java.io.*;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
         int len_A = A.length();
         int len_B = B.length();
         System.out.println(len_A+len_B);
         if(A.compareTo(B)>0)
         System.out.println("Yes");
         else  System.out.println("No");
         System.out.print(((A.substring(0,1)).toUpperCase().concat(A.substring(1,len_A)))+" "+ 
                          ((B.substring(0,1)).toUpperCase().concat(B.substring(1,len_B))));
          
    }
}