import java.io.*;
import java.util.*;

class sqrt{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=Integer.parseInt(s);

        int l=0,h=n;
        int res=0;
        while(l<=h){
            int m=(l+h)/2;
            int sq=m*m;
            if(sq==n){  res=m; break; }
            else if(sq>n)   h=m-1;      //in case of higher values of square, its invalid so we are not storing 
                                        // ans in case of high
            else{   //only in case of lower square value we can expect a valid ans
                l=m+1;
                res=m;
            }
        }

        System.out.println(res);

    }
}