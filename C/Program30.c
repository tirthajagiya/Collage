#include<stdio.h>
void main()
{
    float a,b,c;
    printf("Enter A Value Of A:");
    scanf("%f",&a);
    printf("Enter A Value Of B:");
    scanf("%f",&b);
    printf("Enter A Value Of C:");
    scanf("%f",&c);
    if(a==b&&b==c){printf("Your Triangle Is equilateral.");}
    else if(a==b||b==c||a==c){printf("Your Triangle Is Isoscles.");}
    else if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a){
    printf("Write Right Angle Triangle.");}
    else {printf("Your Triangle IS Scalen.");}
    if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a){
    printf("Write Right Angle Triangle.");}
}
