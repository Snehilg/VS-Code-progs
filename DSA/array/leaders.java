class leaders{
    public static void main(String [] args){
        int arr []={7,10,4,10,6,5,2};
        //int arr[]={10,5,6,89,56,45,12,11,2,5,6,78,11,200,115,14};
        int mr=arr[arr.length-1];
        boolean bool=true;
        for(int i=arr.length-2;i>=0;i--){
            if(bool)
                System.out.print(mr+" ");
            bool=false;
            if(arr[i]>mr){   
                mr=arr[i];  bool=true;
            }
        }//for ends

    }
}