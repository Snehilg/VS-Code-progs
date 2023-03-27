class EOArray{
    public static void main(String [] args){
        int arr[]={5,10,20,6,3,8};

        int res=0,count=1,prev=arr[0]%2;

        for(int i=1;i<arr.length;i++){
            if( ( (arr[i]%2) ^ prev)==1)    count++;
            else    count=1;

            if(res<count)   res=count;

            prev=arr[i]%2;
        }

        System.out.println(res);

    }
}