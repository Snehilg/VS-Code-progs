import java.util.*;

class primeNumber{
    public static void main(String [] args){
        int n=124;
        if(n>=2)   System.out.print("2 ");
        if(n>=3)   System.out.print("3 ");
        if(n>=5)
            for(int i=5;i*i<=n;i+=6)
                System.out.print(i+" "+(i+2)+" ");
    }

    static boolean isPrime2(int n){
        if(n==1 || n==2)    return true;
        else if(n%2==0)     return false;
        else
            for(int i=3;i<=(int)Math.sqrt(n);i+=2)
                if(n%i==0)      return false;
        return true;
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