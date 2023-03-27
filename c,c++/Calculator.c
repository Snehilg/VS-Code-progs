#include<stdio.h>
int main(){
    float a,b,c=0;
    int i=0;
    printf("1) Sum\n");
    printf("2) Subtraction\n");
    printf("3) Multiply\n");
    printf("4) Divide\n");
    printf("5) Modulus\n");
    printf("enter operation\n");
    scanf("%d",&i);
    printf("enter numbers\n");
    scanf("%f %f",&a,&b);
    switch(i){
        case 1:
            c=a+b;
            printf("the result is %f",c);
            break;
        case 2:
            c=a-b;
            printf("the result is %f",c);
            break;
        case 3:
            c=a*b;
            printf("the result is %f",c);
            break;
        case 4:
            c=a/b;
            printf("the result is %f",c);
            break;
        case 5:
            c=(int)a%(int)b;
            printf("the result is %f",c);
            break;
        default:
            printf("please enter correct choice");    
    }

    return 0;
}