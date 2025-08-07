#include<stdio.h>
void main()
{
   float p,r,t,i;
   printf("Enter A Principal:");
   scanf("%f",&p);
   printf("Enter A Rate:");
   scanf("%f",&r);
   printf("Enter A Time Period:");
   scanf("%f",&t);
   i=(p*r*t)/100;
   printf("%f",i);
}
