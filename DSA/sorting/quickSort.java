import java.io.*;
import java.util.*;

class quickSort{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        System.out.println(Arrays.toString(arr));

        //quicklomuto(arr,0,n-1);
        quickhoare(arr,0,n-1);
        
        System.out.println(Arrays.toString(arr));

    }

    static void quicklomuto(int arr[],int l,int h){
        if(l<h){    //we leave pivot in lomuto
            int p=lomuto(arr,l,h);
            quicklomuto(arr,l,p-1);
            quicklomuto(arr,p+1,h);
        }
    }

    static void quickhoare(int arr[],int l,int h){
        if(l<h){
            int p=hoare(arr,l,h);
            quickhoare(arr,l,p);
            quickhoare(arr,p+1,h);
        }
    }

    static int lomuto(int arr[],int l,int h){
        int pivot=arr[h];//pivot is last
        int i=l-1;

        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,h); //swapping pivot

        return (i+1);   //returning position of pivot

    }

    static int hoare(int arr[],int l,int h){
        int pivot=arr[l]; //pivot is start
        int i=l-1,j=h+1;    //do while will bring them in range

        while(true){
            //until greater than pivot
            do{
                i++;
            }while(arr[i]<pivot);

            //until smaller than pivot
            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j) return j;  //equal is also important

            swap(arr,i,j);

        }//while
        
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}