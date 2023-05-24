import java.io.*;
import java.util.*;

class Test{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);
        
        System.out.println(kadane(arr,n));
       
    }//main
    
    static int kadane(int arr[],int n){
        int curr=arr[0];
        int max=arr[0];

        for(int i=1;i<n;i++){
            if(curr<0)  curr=0;
            curr+=arr[i];
            if(max<curr)    max=curr;
        }

        return max;
    }

    static int subSum(int arr[],int rs,int i){
        if(i==0){
            System.out.println(rs);
            if(rs==0)  return 1;
            else return 0;
        }
        int temp=rs-arr[i-1];
        i--;
        return (subSum(arr,rs,i)+subSum(arr,temp,i));
    }

    static void toi(int n,String A,String B,String C){
        if(n==1){
            System.out.println("move disk 1 from "+A+" to "+C);
            return; 
        }
        toi(n-1,A,C,B);
        System.out.println("move disk "+n+" from "+A+" to "+C);
        toi(n-1,B,A,C);
    }

    static boolean isPrime(int n){
        if(n==2 || n==3)    return true;

        if(n%2==0 || n%3==0)    return false;

        for(int i=5;i<=Math.sqrt(n);i=i+6){ 
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    static int sqrt(int n){
        int i=0;
        while(i*i<=n)
            i++;
        return i-1;
    }

    static void per(char str[],int i){
        if(str.length-1==i) System.out.println(str);
        for(int j=i;j<str.length;j++){
            swap(str,i,j);
            per(str,i+1);
            swap(str,j,i);
        }
    }

    static void swap(char str[],int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }

    static long power(int n,int p){
        if(p==0)    return 1;
        if(p==1)     return n;
        long temp=power(n,p/2);
        temp=temp*temp;
        if(p%2==0)  return temp;
        else    return temp*n;
    }

    static int fact(int n){
        if(n<=1)    return 1;
        else return (n*fact(n-1));    
    }

    static int combi(int n,int r){

        return (fact(n)/(fact(r)*fact(n-r)));

    }

    static String randomIntArray(int[] arr,int l, int r){
        Random rand = new Random();
        String str = "";
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.ints(l, (r + 1)).findFirst().getAsInt();
            str += (String.valueOf(arr[i]) + " ");
        }
        return str;
    }

}
