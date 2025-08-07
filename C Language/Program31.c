#include<stdio.h>
void main()
{
    int a;
    printf("Enter A Day Number:");
    scanf("%d",&a);
    switch(a)
    case 1:printf("Sun");
    break;
    case 2:printf("Mon");
    break;
    case 3:printf("Tue");
    break;
    case 4:printf("Wed");
    break;
    case 5:printf("Thu");
    break;
    case 6:printf("Fri");
    break;
    case 7:printf("Sat");
    break;
    default:printf("Enter A Vaild Number.");
    
}
