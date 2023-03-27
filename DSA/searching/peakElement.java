import java.io.*;
import java.util.*;

class peakElement{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");

        int n=s.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);
    
        System.out.println(peak(arr));

    }

    static int peak(int arr[]){
        int l=0,h=arr.length-1;

        /*if(h==0)    return arr[0];
        if(arr[0]>arr[1])       return arr[0];
        if(arr[h]>arr[h-1])     return arr[h];
        */
        int m=0;

        while(l<=h){
            m=(l+h)/2;
                // agar left me hai tabhi condition check krenge
                //same right ke sath hoga
                //iss tarah se bich ke ele ke peak check ho jaege
            if( (m==0 || (arr[m]>=arr[m-1])) && (m==arr.length-1 || (arr[m]>=arr[m+1]) ) )
                break;    

                //agar left side me greater hai to left ke array
            if(m>0 && arr[m-1]>=arr[m])     h=m-1;
            else    l=m+1;
        
        }

        return arr[m];

    }

}