import java.util.Scanner;
class  prime{

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isPrime(a));
    }

    static boolean isPrime(int a){
        if(a<=1)    return true;
        else if(a==2)    return true;
        else if(a%2==0)    return false;
        else
            for(int i=3;i<=Math.sqrt(a);i+=2)
                if(a%i==0)  return false;
        return true;
    }
    static void pPrime(int a){
        for(int i=0;i<=a;i++)
            if(isPrime(i))  System.out.println(i);
    }
}