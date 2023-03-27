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

        System.out.println(mPages(arr,n,k));

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