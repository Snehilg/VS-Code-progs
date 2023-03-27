import java.util.*;

class josephus{

    public static void main(String [] args){
        System.out.println(joseph(7,2));
    }

    static int joseph(int n,int k){
        if(n==1)    return 0;   //coz it will onlu have one position and that will be zero
        else    return (joseph(n-1,k)+k)%n;         //applying the condition so that we can extrcat the orignal position(n th call ke)
                                                    //from positon of call of (n-1)

    }

    static int josep(int n,int k){          //iterative solution
        int poi=0;
        boolean arr[]=new boolean[n];
        Arrays.fill(arr,true);
        
        for(int i=0;i<n-1;i++){
            int count=0;

            while(count!=k-1){      //for finding the man to be killed 
                poi=(poi+1)%n;
                if(arr[poi]) count++;
            }
            
            arr[poi]=false;         //man killed
            
            while(!arr[poi])        //for finding the next alive man
                poi=(poi+1)%n;
        }
        return poi;
    }

}

