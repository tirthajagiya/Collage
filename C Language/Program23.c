#include<stdio.h>
void main()
{
    float a,b;
    char c;
    printf("+ For Add , - For Sub ,* For Mul ,/For Div:");
    scanf("%c",&c);
    printf("Enter A value:");
    scanf("%f",&a);
    printf("Enter B value:");
    scanf("%f",&b);
    if(c=='+')
        {printf("%f",a+b);}
        else{
            if(c=='-')
            {printf("%f",a-b);}
            else{if(c=='*'){printf("%f",a*b);}
            if(c=='/'){printf("%f",a/b);}
            }

        }
}
