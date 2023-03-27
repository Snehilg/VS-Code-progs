import java.util.*;

class permutation{
    public static void main(String [] args){
        String s="A";
        permute(s.toCharArray(),0);
    }

    static void permute(char str[],int i){
        if(str.length-1==i)     System.out.println(str);  //printing only when n-1 chars of string are fixed

        for(int j=i;j<str.length;j++){          //for calling recursively after fixing 1,2... characters 
            swap(str,i,j);                  //swapping 
            permute(str,i+1);           //calling
            swap(str,j,i);      // swapping back to return the orignal string
        }
    }

    static void swap(char str[],int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
}