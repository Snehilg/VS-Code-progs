class subSetRec{
    public static void main(String [] args){
        subSet("ABC"," ",0);
    }

    static void subSet(String s,String curr,int i){
        if(i==s.length()){
            System.out.println(curr);
            return ;
        }
        subSet(s,curr,i+1);
        subSet(s,curr+s.charAt(i),i+1);
    }

    static void sub(String str,ArrayList<String> arr,int k,String as){
        
        if(str.length()==k+1){          //notice the value of k
            arr.add(as);
            arr.add(as+str.charAt(k));
            return ;
        }
        sub(str,arr,k+1,as);
        sub(str,arr,k+1,as+str.charAt(k));
    }

}