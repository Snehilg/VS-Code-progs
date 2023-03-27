import java.util.*;
import java.util.ArrayList;

class Test1{
    public static void main(String [] args){
        String str[]={"A","B","C","D","A","E","D","Z"};

        ArrayList arr =new ArrayList<String>();

        for(String s:str){
            int i=arr.indexOf(s);
            int l=arr.size();
            if(i==-1)
                arr.add(s);
            else{
                Collections.swap(arr,i,l-1);
            }
        }//for ends

        System.out.println(arr);

    }
}