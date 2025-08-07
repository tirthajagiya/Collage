#include<stdio.h>
#include<math.h>
void main()
{
  float a,b,c,root1,root2;
  printf("Enter A Value Of A:");
  scanf("%d",&a); 
  printf("Enter A Value Of B:");
  scanf("%d",&b);
  printf("Enter A Value Of C:");
  scanf("%d",&c); 
  if((4*a*c)<=(b*b))
  {
    root1=((-b)+sqrt(b*b-(4*a*c)))/(2*a);
    root2=((-b)-sqrt(b*b-(4*a*c)))/(2*a);
    printf("Your Root(1) Is: %f",root1);
    printf("Your Root(2) Is: %f",root2);
  }
  else{printf("Root Is Not Difined.");}
}
