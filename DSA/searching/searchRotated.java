import java.io.*;
import java.util.*;

class searchRotated{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        int ele=Integer.parseInt(br.readLine());

        System.out.println(rtSearch(arr,ele));
    }

    static int rtSearch(int arr[],int ele){
        int l=0,h=arr.length-1;

        while(l<=h){    
            int mid=(l+h)/2;
            if(arr[mid]==ele)   return mid;
            if(arr[l]<arr[mid]){   //left array sorted
                if(arr[l]<= ele && arr[mid]>ele)        //in range
                    h=mid-1;
                else
                    l=mid+1;       // for right
            }
            else{       //right sorted
                if(arr[mid]< ele && arr[h]>=ele)        //in range
                    l=mid+1;
                else
                    h=mid-1;       // for left
            }
        }//while ends

        return -1;
    }


}