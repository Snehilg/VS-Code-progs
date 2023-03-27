import java.util.*;
import java.io.*;

public class Codeforces{
    public static void main(String [] args)throws IOException{
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
        }// while ends*/

        ArrayList<String> arr=new ArrayList<String>();
        sub("ABCD",arr,0,"");
        System.out.println(arr.toString());
        

    }// main ends


    static void sub(String str,ArrayList<String> arr,int k,String as){
        
        if(str.length()==k+1){          //notice the value of k
            arr.add(as);
            arr.add(as+str.charAt(k));
            return ;
        }
        sub(str,arr,k+1,as);
        sub(str,arr,k+1,as+str.charAt(k));
    }

}
