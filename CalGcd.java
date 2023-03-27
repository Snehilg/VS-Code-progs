import java.util.*;

class CalGcd{

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        /*int a=sc.nextInt();
        int b=sc.nextInt();*/
        System.out.println(gcd(12,64));
        sc.close();
        
    }

    static int gcd(int a,int b){
        if(b==0)    return a;
        return gcd(b,a%b);
    }

}