import java.io.*;
import java.util.*;

class repeatEle{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        float n=s.length;
        float arr[]=new float[(int)n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        float max=0,sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max)  max=arr[i];
        }

        System.out.println((int)(sum-(max*(max+1)/2))/(n-max));    //in case zero is not compulsory 
                                                                  //use (n-max) else (n-max-1) 

    }
}