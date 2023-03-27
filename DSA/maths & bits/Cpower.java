import java.util.Scanner;
class  Cpower{

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int p=sc.nextInt();
        System.out.println(poww(a,p));
    }

    static int po(int n,int p){
        int temp=n;
        if(n==0) return 0;
        else if(n==1)    return 1;
        else    //coz anything power 1 is the same number so only checking till 1 iteratinig p less by one
            while(p-->1)    temp*=n;
        return temp;
    }

    static int repo(int n,int p){
        if(p==0)    return 1;
        else    return n*repo(n,p-1);
    }

    static int power(int n,int p){
        if(p==0)    return 1;
        int temp=power(n,p/2);
        temp=temp*temp;
        if(p%2==0)  return temp;
        else        return temp*n;
    }

    static int poww(int n,int p){
        int res=1;
        
        while(p>0){         //iterative solution
            if(p%2!=0)
                res*=n;
            p=p/2;
            n*=n;
        }
        return res;
    }
}