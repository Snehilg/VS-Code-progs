import java.io.*;
import java.util.*;

class FlipOZ{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="1 1 0 0 1 0 0 0 1 0 0 1 0 0 1 1";/*"1 0 0 0 1 0 0 1 1 1 1"*/
        String s[]=str.split(" ");
        
        int n=s.length;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        
        int ele=0;
        if(arr[0]==0 && arr[0]==arr[n-1])   ele=1;
        else if(arr[0]==1 && arr[0]==arr[n-1])  ele=0;
        else if(arr[0]!=arr[n-1])   ele=1;

        boolean flag=true;
        for(int i=0;i<n;i++){
            if(arr[i]==ele && flag){
                System.out.print(i+" to ");        
                flag=false;
            }else if(arr[i]!=ele && !flag){
                flag=true;
                System.out.print((i-1)+" \n");
            }

        }

    }
}