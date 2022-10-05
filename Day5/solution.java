import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class solution {
 static int B,H;
public static boolean flag = false;
static
{
    Scanner ob = new Scanner(System.in);
     B = ob.nextInt();
     H = ob.nextInt();
    if(B>0 && H>0)
    {
        flag = true;
    }
    else
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
public static void main(String[] args){
        if(flag){
            int area_of_Parallelogram=B*H;
            System.out.print(area_of_Parallelogram);
        }
        
    }
}