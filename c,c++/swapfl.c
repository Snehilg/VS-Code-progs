#include<stdio.h>
int main(){
    int n=0;
    printf("enter number");
    scanf("%d",&n);
    int l=n%10;
    int f=0,i=n,c=1;
    while(i>0){
        f=i%10;
        i/=10;
        c*=10;        }
    c/=10;
    n=(n%c)+l*c;
    n/=10;
    n=(n*10)+f;
    printf("%d",n);
    return 0;
}