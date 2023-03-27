import java.io.*;
import java.util.Arrays;
import java.lang.Math;
public class Codechef{
    public static void main(String [] args)throws IOException{

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
		    
		    int n=Integer.parseInt(br.readLine());
		    String s[]=br.readLine().split(" ");
		    
		    boolean bool=true;
		    
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=Integer.parseInt(s[i]);
		        
		    Arrays.sort(arr);
		    int count=0;
		    
		    for(int i=0;i<n-1;i++){
		        
		        if(arr[i]!=arr[i+1])
		            count=0;
		        else
		            count++;
		            
		      	if(count==2){ bool=false;  break;}
		      
		      
		    }//for
		    
		    if(bool)    System.out.println("YES");
		    else        System.out.println("NO");
		    
		    
		}//while
	}

}





