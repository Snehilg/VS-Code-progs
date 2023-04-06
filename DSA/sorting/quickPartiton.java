import java.io.*;
import java.util.*;

class quickPartiton{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        //int j=Integer.parseInt(br.readLine());

        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        //int key=arr[j];

        System.out.println(Arrays.toString(arr));

        /*for(int i=0;i<n;i++){
            if(key<=arr[i] && j>i){  //pehle ka element greater
                shift(arr,i,j-1);
                arr[i]=key; j=i;
                //System.out.println(Arrays.toString(arr));
            }else if(key>arr[i] && j<i){          //baad ka element smaller
                int temp=arr[i];
                shift(arr,j,i-1);
                arr[j]=temp;    j++;
                //System.out.println(Arrays.toString(arr));
            }
        }//for*/

        //lomuto(arr,0,n-1);
        //hoare(arr,0,n-1);

        hoaregfg(arr,0,n-1);

        System.out.println(Arrays.toString(arr));

    }

    static void shift(int arr[],int s,int e){
        for(int i=e;i>=s;i--)
            arr[i+1]=arr[i];
    }
    
    static void lomuto(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
               i++;
               swap(arr,i,j); 
               
            }
        }

        swap(arr,i+1,h);
        //will be used in quicksort
        //return (i+1);     //returning pivot pos
    }
    
    static void hoare(int arr[],int l,int h){
        int i=l,j=h;
        int pivot=arr[l];
        
        //goal is to find greater element in left
        //and smaller element in right than pivot & swap
        while(i<j){
            if(arr[i]<pivot)
                i++;
            if(arr[j]>pivot)
                j--;
            
            if(arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
                i++;    j--;
            }
        }
    }

    static void hoaregfg(int arr[],int l,int h){
        int i=l-1,j=h+1;
        int pivot=arr[l];
    
        while(true){

            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){    
                break;
                //will be used in quicksort
                return j;
            }
            swap(arr,i,j);

        }
       

    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}