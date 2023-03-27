import java.util.Scanner;

class  GcdLcm{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    
    }// main method ends

    static int gcd(int a,int b){
        
        if(b==0)    return a;
        else        return gcd(b,a%b);
        
        /*while(a!=b){
            if(a>b) a=a-b;
            else    b=b-a;
        }
        return a;*/
    }

    int static lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

}//class ends
