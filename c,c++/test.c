#include<stdio.h>
#include<conio.h>
void main(){
    int arr []={2,4,1,6,5,9,10,3};
    int min=11;
    int max=0;
    //int n=sizeof(arr)/sizeof(int);
    for(int i=7;i>=0;i--){
        if(arr[i]<min)  min=arr[i];
        if(arr[i]>max)  max=arr[i];
    }
    
    printf("Minimum element is %d\n",min);
    printf("Maximum element is %d\n",max);

    getch();
}