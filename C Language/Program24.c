#include<stdio.h>
void main()
{
    float s;
    printf("Enter A Value Of Basic salary:");
    scanf("%f",&s);
    if(s>=30000){printf("%f",(s+(0.30*s)+(0.95*s)));}
    else if(s>=20000){printf("%f",(s+(0.25*s)+(0.90*s)));}
    else if(s>=10000){printf("%f",(s+(0.2*s)+(0.8*s)));}
}
