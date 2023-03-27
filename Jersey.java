public class Jersey {
    public static void main(String[] args) {
        int board[]={0,1,2,3};
        int arr[]=new int[board.length];
        for(int i=1;i<board.length;i++)
            arr[i]=i;

        System.out.println(doit(board,arr));
    }


    static int doit(int board[],int arr[]){
        int count=0;
        int len=board.length;
        int nar[]=new int[len];
        
        for(int i=1;i<len;i++)
            nar[board[i]]=arr[i];
        
        for(int i=1;i<len;i++)
            if(nar[i]!=board[i])    count++;
        
        if(count==0)    return 2;
        else            return 1+doit(board,nar);
    
    }

}
//23154