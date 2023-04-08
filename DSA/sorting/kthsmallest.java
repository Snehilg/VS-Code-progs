import java.io.*;
import java.util.*;

class kthsmallest{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int k=Integer.parseInt(br.readLine());
        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        System.out.println(Arrays.toString(arr));

        System.out.println(smallest(arr,0,n-1,k));
        System.out.println(Arrays.toString(arr));

    }

    static int smallest(int arr[],int l,int r,int k){
       while(l<=r){     //we are using loop coz we reapeatedly have to call lomuto around a pivot
            int p=lomuto(arr,l,r);
            //if p is k-1, we got the result
            //else we will try to reduce our search positon based on p & k

            if(p==k-1)  return arr[k-1];
            else if(p>k-1)  r=p-1;      //if the pivot is ahead of k, sort array l->p-1, kyuki isme k-1 hoga
            else l=p+1;

        }
        return -1;
    }

    static int lomuto(int arr[],int l,int r){
        int pivot=arr[r];
        int i=l-1;

        for(int j=l;j<r;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,r);
        return (i+1);
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}


