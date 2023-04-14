import java.io.*; 
import java.util.*;

class maxGuest{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        //arival array
        int n=s.length;
        int arv[]=new int[n];
        for(int i=0;i<n;i++)
            arv[i]=Integer.parseInt(s[i]);

        //departure array
        s=br.readLine().split(" ");
        int m=s.length;
        int dep[]=new int[m];
        for(int i=0;i<m;i++)
            dep[i]=Integer.parseInt(s[i]);

        int i=1,j=0,res=1,curr=1;
        //already considered first element of arival array
        //sorting arv and dep

        Arrays.sort(arv);   Arrays.sort(dep);

        while(i<n && j<m){
            if(arv[i]<=dep[j]){
                curr++; i++;
            }else{
                curr--; j++;
            }

            res=Math.max(res,curr);
        }//while

        System.out.println(res);

    }
}