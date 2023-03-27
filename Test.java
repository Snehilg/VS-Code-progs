import java.io.*;
import java.util.*;

class Test{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s[]=br.readLine().split(" ");
        int n=s.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        int sum=Integer.parseInt(br.readLine());

        boolean found=false;
        int i=0,j=n-1,k=0;

        while(!found){
            if(arr[i]+arr[j]<sum){
                int f=sum-(arr[i]+arr[j]);

                for(k=0;k<n;k++){
                    if(k==i || k==j)    continue;
                    if(arr[k]==f)   found=true;
                }

                if(!found){
                i++;
                }
            }else if(arr[i]+arr[j]>sum){
                j--;
            }
            
        }

        if(found)
            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
        else
            System.out.println(-1);
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

    static int power(int n,int p){
        
        int max=1000000000+7;
        if(p==0)    return 1;
        int temp=power(n,p/2);
        temp=(temp*temp);
        if(p%2==0)  return temp;
        else        return (temp*n);
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
