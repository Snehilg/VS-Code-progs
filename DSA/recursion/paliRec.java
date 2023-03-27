import java.io.*;
import java.util.*;
import java.lang.Math;
import java.lang.String;

public class paliRec {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(pali(s,0));
        System.out.println(palig(s,0,s.length()-1));
    }

    static boolean pali(String s,int k){        //mera code
        if(k>((s.length()/2)+1))    return true;
        if(s.charAt(k)==s.charAt(s.length()-1-k))   return pali(s,++k);
        return false;
    }

    static boolean palig(String s,int start,int end){       //gfg code
        if(start>=end)  return true;
        return ( (s.charAt(start)==s.charAt(end) ) && ( palig(s,++start,--end) ) );
    }
    

}
