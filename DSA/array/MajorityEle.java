import java.io.*;
import java.util.*;

class MajorityEle{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        
        int n=s.length;
        int arr[]=new int[n];
        int cop[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
            cop[i]=arr[i];
        }

        int count=1;
        int max=0;
        
        Arrays.sort(cop);
        int prev=cop[0];
        int ele=cop[0];

        
        for(int i=1;i<n;i++){
            if(prev==cop[i])     count++;
            else    count=1;

            if(max<count){
                max=count;
                ele=cop[i];
            }
            
            prev=cop[i];
        }

        if(max>(n/2)){
            for(int i=0;i<n;i++)
                if(arr[i]==ele){
                    System.out.println(i);
                    break;        
                }
        }else
            System.out.println("-1");

    }

}
