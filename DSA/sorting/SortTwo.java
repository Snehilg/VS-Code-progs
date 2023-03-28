import java.io.*;
import java.util.*;

class SortTwo{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=Integer.parseInt(s[i]);

        s=br.readLine().split(" ");
        int m=s.length;
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=Integer.parseInt(s[i]);

        printSorted(arr1,arr2);

    }

    static void printSorted(int arr1[],int arr2[]){
        int n=arr1.length,m=arr2.length;

        int i=0,j=0;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }//while

        while(i<n){
            System.out.print(arr1[i]+" ");
                i++;
        }

        while(j<m){
            System.out.print(arr2[j]+" ");
                j++;
        }

    }

}