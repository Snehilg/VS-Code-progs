import java.io.*;
import java.util.*;

class choclate{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int m=Integer.parseInt(br.readLine());
        int n=s.length;
        int arr[]=new int[n];

        if(m>n){
            System.out.println("-1");
            System.exit(0);
        }

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        Arrays.sort(arr);

        int res=arr[m-1]-arr[0];            //simply sorting and traversing checking diff between m elements
        for(int i=1;i<n-m+1;i++){
            res=Math.min(res,arr[i+m-1]-arr[i]);
        }

        System.out.println(res);

    }
}