import java.io.*;
import java.util.*;

class countInver{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        int count=0;
        
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[i])   count++;

        System.out.println(count +" "+countInv(arr,0,n-1));

    }

    static int countInv(int arr[],int l,int r){
        int res=0;
        int m=l+((r-l)/2);

        if(l<r){
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,r);
            res+=mergeAndCount(arr,l,m,r);
        }

        return res;

    }  

    static int mergeAndCount(int arr[],int l,int m,int r){
        int n1=m-l+1; int n2=r-m;

        int left[]=new int[n1];
        int right[]=new int[n2];

        //copying
        for(int i=0;i<n1;i++)   left[i]=arr[l+i];
        for(int i=0;i<n2;i++)   right[i]=arr[m+1+i];

        //extra result variable
        int res=0;

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
                //tested extra line to find number of elements in sorted left part which are 
                //greater than the smaller elements in right
                res+=(n1-i);
            }
            k++;
        }
        
        while(i<n1){
            arr[k]=left[i];
            i++; k++;
        }

        while(j<n2){
            arr[k]=right[j];
            j++; k++;
        }

        return res;
    }


}
