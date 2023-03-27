class secMax{
    public static void main(String[] args) {
        int arr []={10,5,6,89,56,45,12,11,2,5,6,78,11,200,115,14};
        int m=arr[0]>arr[1]?arr[0]:arr[1];
        int sm=arr[0]<arr[1]?arr[0]:arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[m])
                m=i;
            if(arr[i]<arr[m] && arr[i]>arr[sm])
                sm=i;
        }

        if(sm==m)   System.out.println("-1");
        else        System.out.println(sm+" "+arr[sm]);
        
    }
}