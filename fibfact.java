import java.io.*;
import java.util.*;

class fibfact{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        System.out.println(fib(n));
    }

   static int fib(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        return fib(n-2)+fib(n-1);
    }

    static int fact(int n){
        if( n==0) return 1;
        return n*fact(n-1);
    }

    static int tailfact(int k,int n){
        if(n==0) return k; 
        k*=n;
        return tailfact(k,n-1);
    }

}