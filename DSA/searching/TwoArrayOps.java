import java.io.*;
import java.util.*;

class TwoArrayOps{
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

        ArrayList<Integer>  arr=new ArrayList<Integer>();
        intersection(arr1,n,arr2,m,arr);
        System.out.println(arr.toString());
        arr.clear();
        union(arr1,n,arr2,m,arr);
        System.out.println(arr.toString());
    }

    static void intersection(int arr1[],int n,int arr2[],int m,ArrayList arr){
        int i=0,j=0;
        while(i<n && j<m){
            if(i!=0 && arr1[i-1]==arr1[i]){     //only checking in i to avoid same element
                i++; continue;
            }else if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{           //if equal
                arr.add(arr1[i]);
                i++; j++;
            }
        }
    }

    static void union(int arr1[],int n,int arr2[],int m,ArrayList arr){
        int i=0,j=0;
        while(i<n && j<m){
            if(i!=0 && arr1[i-1]==arr1[i]){     //skipping repeating elements
                i++;    continue;
            }
            if(j!=0 && arr2[j-1]==arr2[j]){
                j++;    continue;
            }
            if(arr1[i]<arr2[j]){
                arr.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr.add(arr2[j]);
                j++;
            }
            else{           //if equal
                arr.add(arr1[i]);
                i++; j++;
            }
        }

        while(i<n){                     //if element remain in arr1
            if(i!=0 && arr1[i-1]==arr1[i]){
                i++;    continue;
            }
            arr.add(arr1[i]);
            i++;
        }

         while(j<m){                    //if element remain in arr2
            if(j!=0 && arr2[j-1]==arr2[j]){
                j++;    continue;
            }
            arr.add(arr2[j]);
            j++;
        }
    }

   
}