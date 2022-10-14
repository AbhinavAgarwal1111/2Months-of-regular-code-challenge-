import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solution {

static void solve(double meal_cost, int tip_percent, int tax_percent) 
{
        double tip=meal_cost*tip_percent/100;
        double tax=meal_cost*tax_percent/100;
        int totalCost=(int)Math.round(meal_cost+tip+tax);
        System.out.print(totalCost);
    }
    public static final Scanner ob = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = ob.nextDouble();
        int tip_percent = ob.nextInt();
        int tax_percent = ob.nextInt();
        solve(meal_cost, tip_percent, tax_percent);

    }
}
