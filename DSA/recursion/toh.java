import java.util.*;

class toh{

    public static void main(String [] args){
        towerOfHanoi(3,'A','B','C');
    }

    static void towerOfHanoi(int n,char a,char b,char c){       //a->source b->auxilary c->destination
        if(n==1){
            System.out.println("Move 1 from "+a+" to "+c);
            return ;
        }
        towerOfHanoi(n-1,a,c,b);                                //moving (n-1) from a to b using c as an auxilary
        System.out.println("Move "+n+" from "+a+" to "+c);
        towerOfHanoi(n-1,b,a,c);
    }

}