import java.util.*;
import java.io.*;
import java.lang.Math;

class SievErath{
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean sieve[]=new boolean[n+1];
        Arrays.fill(sieve,true);
        for(int i=2;i<=Math.sqrt(n);i++)
            if(isPrime(i))
                for(int j=2*i;j<=n;j+=i)    sieve[j]=false;

        for(int i=2;i<=n;i++)
            if(sieve[i])
                System.out.print(i+" ");
            

    }

    public static boolean isPrime(int n){
        if(n==1 || n==2 || n==3)    return true;
        else if(n%2==0 || n%3==0)     return false;
        else
            for(int i=5;i<=Math.sqrt(n);i+=6)
                if(n%i==0 || n%(i+2)==0)    return false;
        return true;
        }

}
