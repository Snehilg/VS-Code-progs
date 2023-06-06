import java.io.*;
import java.util.*;

class Test{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=s.length;
        int st[]=new int[n];
        int en[]=new int [n];
        for(int i=0;i<n;i++)
            st[i]=Integer.parseInt(s[i]);
        
        s=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            en[i]=Integer.parseInt(s[i]);
        
        int start=st[0],end=en[0];
        int i=1;

        while(i<=n-1){
            if(st[i]<=end){
                if(end<en[i])   end=en[i];
            }else{
                System.out.println(start+" "+end);
                start=st[i];
                end=en[i];
            }
            i++;
        }
        System.out.println(start+" "+end);
        
       
    }//main
    
    static int hoarse(int arr[],int l,int h){
        int i=l-1,j=h+1;
        int pivot=arr[l];
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>j) break;
            else    swapArr(arr,i,j);
        }
        return j;
    }

    static int lomuto(int arr[],int l,int h){
        int pivot=arr[h];
        int j=l,i=l-1;
        while(j<h){
            if(arr[j]<pivot){
                i++;
                swapArr(arr,i,j);
                //System.out.println(Arrays.toString(arr));
            }
            j++;
        }
        i++;
        swapArr(arr,i,h);
        return i;
    }

    static void swapArr(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void mergesort(int arr[],int l,int r){
        int m=(l+r)/2;
        if(l<r){
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    static void merge(int arr[],int l,int m,int r){
        //left array l -> m
        //right array (m+1)->r
        int n1=m-l+1;
        int n2=r-m;

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for(int i=0;i<n1;i++)
            arr1[i]=arr[l+i];
        
        for(int i=0;i<n2;i++)
            arr2[i]=arr[m+1+i];

        int i=0; int j=0; int k=l;

        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }

    }

    static void swapInt(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int maxPageSum(int arr[],int k){
        int l=0,h=0,res=0;
        for(int i:arr){
            h+=i;
            if(i>l) l=i;
        }

        while(l<=h){
            int m=(l+h)/2;
            if(feasible(arr,k,m)){
                res=m;
                h=m-1;
            }else
                l=m+1;
        }

        return res;
    }

    static boolean feasible(int arr[],int k,int m){
        int count=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>m){
                count++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }

        return count<=k;
    }

    /*static int pageSum(int arr[],int n,int k){
        if(n)    return ;
        if(k==1)    return ;
        int res=Integer.MAX_VALUE;
        /*for(int i=n-1;i>=0;i--)
            res=Math.min(res,Math.max(arraySum(arr,,),pageSum(arr,,)));
        return res; 
    }*/

    static int arraySum(int arr[],int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++)
            sum+=arr[i];
        return sum;
    }

    static int kadane(int arr[],int n){
        int curr=arr[0];
        int max=arr[0];

        for(int i=1;i<n;i++){
            if(curr<0)  curr=0;
            curr+=arr[i];
            if(max<curr)    max=curr;
        }

        return max;
    }

    static int subSum(int arr[],int rs,int i){
        if(i==0){
            System.out.println(rs);
            if(rs==0)  return 1;
            else return 0;
        }
        int temp=rs-arr[i-1];
        i--;
        return (subSum(arr,rs,i)+subSum(arr,temp,i));
    }

    static void toi(int n,String A,String B,String C){
        if(n==1){
            System.out.println("move disk 1 from "+A+" to "+C);
            return; 
        }
        toi(n-1,A,C,B);
        System.out.println("move disk "+n+" from "+A+" to "+C);
        toi(n-1,B,A,C);
    }

    static boolean isPrime(int n){
        if(n==2 || n==3)    return true;

        if(n%2==0 || n%3==0)    return false;

        for(int i=5;i<=Math.sqrt(n);i=i+6){ 
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    static int sqrt(int n){
        int i=0;
        while(i*i<=n)
            i++;
        return i-1;
    }

    static void per(char str[],int i){
        if(str.length-1==i) System.out.println(str);
        for(int j=i;j<str.length;j++){
            swap(str,i,j);
            per(str,i+1);
            swap(str,j,i);
        }
    }

    static void swap(char str[],int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }

    static long power(int n,int p){
        if(p==0)    return 1;
        if(p==1)     return n;
        long temp=power(n,p/2);
        temp=temp*temp;
        if(p%2==0)  return temp;
        else    return temp*n;
    }

    static int fact(int n){
        if(n<=1)    return 1;
        else return (n*fact(n-1));    
    }

    static int combi(int n,int r){

        return (fact(n)/(fact(r)*fact(n-r)));

    }

    static String randomIntArray(int[] arr,int l, int r){
        Random rand = new Random();
        String str = "";
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.ints(l, (r + 1)).findFirst().getAsInt();
            str += (String.valueOf(arr[i]) + " ");
        }
        return str;
    }

}
