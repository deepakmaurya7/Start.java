//package main.java;
import java.util.*;
import java.util.jar.Attributes;

public class main {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = a+b;
       System.out.print(sum);

       int diff = a-b;
       System.out.print(diff);

       int mul = sum*diff;
       System.out.print(mul);

       int ans = mul/sum;
       System.out.print(ans);
    
    }

}