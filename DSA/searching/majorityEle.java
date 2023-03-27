import java.io.*;
import java.util.*;

class majorityEle{// the element occuring more than half times size of the array
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        System.out.println(checkmaj(arr,n));

    }

    static int checkmaj(int arr[],int n){
        
        int res=0,count=1;      //checking for first element

        for(int i=1;i<n;i++){                       //pass 1 for selecting the majority element
            if(arr[res]==arr[i])    count++;
            else    count--;

            if(count==0){           //if count is zero , check for the new element
                res=i;
                count=1;
            }
        }

        count=0;            //now chechking weather majority or not

        for(int i=0;i<n;i++)
            if(arr[res]==arr[i])    count++;

        if(count>=n/2+1)    return res;

        return -1;
    }

}