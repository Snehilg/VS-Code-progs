import java.io.*;
import java.util.*;

class pairSum{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        int ele=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        triplet(arr,ele);

    }

    static void triplet(int arr[],int ele){

        for(int i=0;i<arr.length;i++){
            int sum=ele-arr[i];

            int l=i+1,r=arr.length-1;

            while(l<r){
                if(arr[l]+arr[r]==sum){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                    System.exit(0);
                }else if(arr[l]+arr[r]<sum)     l++;
                else    r--;
            }

        }//for

        System.out.println("-1");

    }
    
    static void pair(int arr[],int ele){
        int l=0,r=arr.length-1;
        
        while(l<r){                                             //two pointer approach
            if(arr[l]+arr[r]==ele){
                System.out.println(arr[l]+" and "+arr[r]);
                System.exit(0);
            }
            else if(arr[l]+arr[r]>ele)     r--;
            else    l++;
        }


        System.out.println("-1");
    }
}