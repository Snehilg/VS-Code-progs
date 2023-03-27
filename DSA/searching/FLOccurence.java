import java.io.*;
import java.util.*;

class FLOccurence{
     public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        
        int n=s.length;
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);
        
        //int ele=Integer.parseInt(br.readLine());

        //System.out.println(firstOccur(arr,n,ele));
        //System.out.println(lastOccur(arr,n,ele)-firstOccur(arr,n,ele)+1);
        System.out.println(n-firstOccur(arr,n,1));
    }

    static int firstOccur(int arr[],int n, int ele){
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]<ele)      l=m+1;
            else if(arr[m]>ele)     h=m-1;
            else{//condition for first occurence
                if(m==0 || (arr[m-1]!=arr[m]) )     return m;
                else    h=m-1;
            }
        }
        return -1;
    }

    static int lastOccur(int arr[],int n, int ele){
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]<ele)      l=m+1;
            else if(arr[m]>ele)     h=m-1;
            else{//condition for last occurence
                if(m==n-1 || (arr[m]!=arr[m+1]) )     return m;
                else    l=m+1;
            }
        }
        return -1;
    }

}