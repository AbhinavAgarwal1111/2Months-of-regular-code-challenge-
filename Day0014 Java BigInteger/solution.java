import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
         BigInteger sum = a.add(b);
          BigInteger prod = a.multiply(b);
        
        System.out.println(sum+"\n"+prod);
    }
}