import java.util.*;
import java.io.*;

class CirSubSum{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        
        int n=s.length;
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);
        
        int curr=arr[0];                    //kadane for normal sum
        int normal_max=arr[0];

        for(int i=1;i<n;i++){
            if(curr<0)  curr=0;
            curr+=arr[i];
            if(normal_max<curr) normal_max=curr;
        }

        if(normal_max<0){
            System.out.println(normal_max);
            System.exit(0);
        }
    
        curr=arr[0];                //reverse kadanes
        int min=arr[0];
        int sum=arr[0];
        for(int i=1;i<n;i++){
            if(curr>0) curr=0;
            curr+=arr[i];
            sum+=arr[i];
            if(min>curr)    min=curr;
        }

        int circular_max=sum-min;

        System.out.println(Math.max(circular_max,normal_max));
    }
}