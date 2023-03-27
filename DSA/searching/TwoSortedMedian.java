import java.io.*;
import java.util.*;

class TwoSortedMedian{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        
        int n1=s.length;
        int a1[]=new int[n1];
        
        for(int i=0;i<n1;i++)
            a1[i]=Integer.parseInt(s[i]);

        s=br.readLine().split(" ");
        
        int n2=s.length;
        int a2[]=new int[n2];
        
        for(int i=0;i<n2;i++)
            a2[i]=Integer.parseInt(s[i]);               //till now both array and sizes we have and a1 is the smaller array
        
        median(a1,a2);

    }

    static void median(int a1[],int a2[]){
        int n1=a1.length,n2=a2.length;
        int l=0,h=n1-1;

        while(l<h){
            
            int i1=(l+h)/2;
            int i2=((n1+n2+1)/2)-i1;

            int max1=(i1==0)?Integer.MIN_VALUE:a1[i1-1];
            int min1=(i1==n1)?Integer.MAX_VALUE:a1[i1];
            int max2=(i2==0)?Integer.MIN_VALUE:a2[i2-1];
            int min2=(i2==n2)?Integer.MAX_VALUE:a2[i2];

            if(max1<=min2 && max2<=min1){
                if((n1+n2)%2==0)
                    System.out.println((double)(Math.max(max1,max2)+Math.min(min1,min2))/2);
                else
                   System.out.println((double)Math.max(max1,max2));
                break;
            }else if(min1<max2)     l=i1+1;
            else    h=i1-1;

        }//while

        
    }


}