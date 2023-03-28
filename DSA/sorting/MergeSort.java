import java.io.*;
import java.util.*;

class MergeSort{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        merSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void merSort(int arr[],int l,int r){

        if(l<r){        //at least two element
            int m=l+(r-l)/2;        //to avoid overflow its same as (l+r)/2
            merSort(arr,l,m);
            merSort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

    static void merge(int arr[],int l,int m,int r){
       
        int n1=m-l+1; int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++)         //copying arr from l->m
            left[i]=arr[l+i];
        
        for(int i=0;i<n2;i++)         //copying arr from m+1->r
            right[i]=arr[n1+i];       //using n1

        int i=0,j=0,k=0;

        while(i<n1 && j<n2){        //merging
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++; k++;
            }else{
                arr[k]=right[j];
                j++; k++;
            }
        }//while

        while(i<n1){
            arr[k]=left[i];
            i++; k++;
        }

        while(j<n2){
            arr[k]=right[j];
            j++; k++;
        }

    }//merge function

}