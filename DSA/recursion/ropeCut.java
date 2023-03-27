import java.io.*;
import java.util.*;
import java.lang.Math;

class ropeCut{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        System.out.println(rope(n,a,b,c));
    }

    static int rope(int n,int a,int b,int c){           //better solution using DP
        if(n<0)     return -1;
        if(n==0)    return 1;
        
        int res= Math.max( Math.max(rope(n-a,a,b,c),rope(n-b,a,b,c)),rope(n-c,a,b,c) );

        if(res==-1) return -1;
         return (res+1);

    }

}