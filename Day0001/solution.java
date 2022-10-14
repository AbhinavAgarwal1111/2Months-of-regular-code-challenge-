/* link of the question: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true */

package Day1;


import java.util.Scanner;



public class solution {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else if(n>=2&&n<=5)
        {
            System.out.println("Not Weird");  
        }
        else if(n>=6&&n<=20)
        {
            System.out.println("Weird");
        }
        else if(n>20)
        {
             System.out.println("Not Weird");
        }
        
        
    }
}



