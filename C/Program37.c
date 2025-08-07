#include<stdio.h>
void main()
{
    char a;
    printf("Enter A Value:");
    scanf("%c",&a);
    ('a'<=a && 'z'>=a) || ('A'<=a && 'Z'>=a)?printf("Alphabet"):printf("Not Alphabet");
}
