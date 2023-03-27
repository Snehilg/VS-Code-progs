import java.io.*;
import java.util.*;

class minPage{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        
        int k=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        //System.out.println(mPages(arr,n,k));  //recursive

        //iterative solution

        int l=0,h=0;    // l is max & h is sum 

        for(int i:arr){
            if(l<i) l=i;
            h+=i;
        }

        int res=0;

        while(l<=h){
            int m=(l+h)/2;
            if(feasible(arr,n,m,k)){
                res=m;
                h=m-1;
            }
            else
                l=m+1;
        }

        System.out.println(res);

    }

    static boolean feasible(int arr[],int n,int m,int k){

        int count=1,sum=0;

        for(int i=0;i<n;i++){
            if(sum+arr[i]>m){
                count++;
                sum=arr[i];
            }
            else
                sum+=arr[i];
        }
        
        return (count<=k);
    }


    static int mPages(int arr[],int n,int k){       //recursive function for counting minimum pages
        if(k==1)    //whole array sum
            return arraySum(arr,0,n-1);
        
        if(n==1)    return arr[0];      //if only one book in array

        int res=Integer.MAX_VALUE;      

        for(int i=1;i<n;i++){
            res=Math.min(res,            //minimum of previously counted max pages and currently calculated
                Math.max(               //taking max , coz that's we are supposed to do(asked in the problem)
                mPages(arr,i,k-1),     //we are alloting 0->i array to remainig students
                arraySum(arr,i,n-1)   //and i-> (n-1) array to current student
                ));
        }//for

        return res;

    }

    static int arraySum(int arr[],int s,int e){        //sum of the array
        int sum=0;
        for(int i=s;i<=e;i++)
            sum+=arr[i];

        return sum;
    }

}