import java.io.*;
import java.util.*;

//creating interval class and implementing comparable interface to sort with respect to first point
class Interval implements Comparable<Interval>{
    int a=0;
    int b=0;

    Interval(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int compareTo(Interval I){
        return this.a-I.a;
    }
}

class mergeOverlapInter{
    public static void main(String [] args)throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());  //number of points to enter
        Interval interval[]=new Interval[n];    //array of type interval
        for(int i=0;i<n;i++){
            String s[]=br.readLine().split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            interval[i]=new Interval(a,b);
        }
        Arrays.sort(interval);
        //you begin from 1st index and use the previous object in array to store the data
        //res will keep the count upto where the ans is stored in the array
        //keep on traversing and applying the logic and storing result according to logic

        int res=0;//start res will be stored in first object
        for(int i=1;i<n;i++){
            //if end (b) of existing interval is falling between new interval 
            if(interval[res].b>=interval[i].a){
                //min of both start(a) points and max of end(b)
                interval[res].a=Math.min(interval[i].a,interval[res].a);
                interval[res].b=Math.max(interval[i].b,interval[res].b);
            }else{//time to add a new interval in res, as their is a gap 
                res++;
                //the new gap ke baad wala interval is the new res interval
                interval[res]=interval[i];
            }
        }

        for(int i=0;i<=res;i++)
            System.out.println(interval[i].a+" "+interval[i].b);
        
       
    }//main
    
    //my function to find if starting and ending points are entered in form of two different arrays
    //where first array is sorted
    static void overlappingInter()throws IOException,NumberFormatException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=s.length;
        int st[]=new int[n];
        int en[]=new int [n];
        for(int i=0;i<n;i++)
            st[i]=Integer.parseInt(s[i]);
        
        s=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            en[i]=Integer.parseInt(s[i]);
        
        int start=st[0],end=en[0];
        int i=1;

        while(i<=n-1){
            if(st[i]<=end){
                if(end<en[i])   end=en[i];
            }else{
                System.out.println(start+" "+end);
                start=st[i];
                end=en[i];
            }
            i++;
        }
        System.out.println(start+" "+end);
    }

}

