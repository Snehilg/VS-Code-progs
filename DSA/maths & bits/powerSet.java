import java.util.*;
class powerSet{
    public static void main(String [] args){
        String str="abcde";
        int n=str.length();
        int setSize=(int)Math.pow(2,n);

        for(int i=0;i<setSize;i++){
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0)    
                    System.out.print(str.charAt(j));
            }
            System.out.print("\n");
        }
    }
}