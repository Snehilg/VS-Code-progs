import java.io.*;
import java.util.*;

class twoWayPartition{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        //we can use either hoare's or lomuto along with suitable pivot and while condition 
        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        //hoareNeg(arr,n,0);

        //we dont need pivot in even odd
        hoareEvenOdd(arr,n);

        System.out.println(Arrays.toString(arr));

    }//main

    static void hoareEvenOdd(int arr[],int n){
        int i=-1,j=n;
        //first even then odd
        while(true){
        
            do{
                i++;    
            }while((arr[i]%2)==0);

            do{
                j--;
            }while((arr[j]%2)!=0);

            if(i>=j)    break;

            swap(arr,i,j);
        }

    }//hoare even odd

    static void hoareNeg(int arr[],int n,int p){
        int i=-1,j=n;
        
        //first neg then pos
        while(true){

            do{
                i++;    
            }while(arr[i]<p);

            do{
                j--;
            }while(arr[j]>p);

            if(i>=j)    break;

            swap(arr,i,j);
        }

    }//hoare

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }//swap

}//class