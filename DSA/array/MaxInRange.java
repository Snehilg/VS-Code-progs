import java.io.*;
import java.util.*;
//given two array l & r with range of elemnts, you have to find the element occuring max times in all ranges
class MaxInRange{
    public static void main(String [] args)throws IOException,NumberFormatException{
        int l[]={1,2,5,15};
        int r[]={5,8,7,18};

        //since upper bound of element is 1000
        //ArrayList<Integer> arr=new ArrayList<Integer>(1000);
        int arr[]=new int[1000];

        //increase by one elements in l(starting range)
        //decrease by one elements in r(ending range)(nulify the change)
        //find prefix sum of arr and you'll have freq of every element

        for(int i=0;i<l.length;i++){
            arr[l[i]]=1;//arr.set(l[i],1);
            arr[r[i]+1]=-1;//arr.set(r[i],-1);
        }

        int ele=0,max=0;

        for(int i=1;i<1000;i++){
            arr[i]+=arr[i-1];//arr.set(i,arr.get(i)+arr.get(i-1));
            if(arr[i]>max){
                max=arr[i];
                ele=i;
            }
        }
        
        System.out.println(ele);
    }

} 