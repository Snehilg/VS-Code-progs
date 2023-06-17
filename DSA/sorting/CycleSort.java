import java.io.*;
import java.util.*;

class CycleSort{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=s.length;
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);

        System.out.println(Arrays.toString(arr));

        //concept is to begin from a point and come back to that point until then keep swapping 
        //elements coming in to the cycle into there correct position
        //cb-> cycle begining
        for(int cb=0;cb<=n-2;cb++){
            int pos=cb;
            int item=arr[pos];

            //loop to calculate the small elements after the cycle begining
            for(int i=cb+1;i<n;i++)
                if(arr[i]<item) pos++;
            
            if(pos==cb)  continue;

            //if duplicate element , go one place ahead
            while(item==arr[pos])
                pos+=1;

            //swapping if element not same
            if(arr[pos]!=item){
                int temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }

            //while to return back to return at begining after swapping
            while(cb!=pos){
                pos=cb;

                for(int i=cb+1;i<n;i++)
                    if(arr[i]<item) pos++;
                
                //if duplicate element , go one place ahead
                while(item==arr[pos])
                    pos+=1;

                if(arr[pos]!=item){
                    int temp=item;
                    item=arr[pos];
                    arr[pos]=temp;
                }


            }
        }

        System.out.println(Arrays.toString(arr)); 

    }//main

}//class