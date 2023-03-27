import java.util.*;

class SubsetSum{
    public static void main(String [] args){
        int arr[]={2,5,2};
        System.out.println(subSum(arr,7,0,0));
    }

    static int subSum(int arr[],int rs,int as,int i){
        // System.out.println(rs+" "+as+" "+i);
         if(arr.length==i){              
            if(as==rs)  return 1;
            else return 0;
        }
	    
        return subSum(arr,rs,as,i+1) + subSum(arr,rs,as+arr[i],i+1);
        
    }

}