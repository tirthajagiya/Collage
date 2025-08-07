#include<stdio.h>
void main()
{int i,j,n,s,term;
scanf("%d",&n);
s= 0;
for(i=1; i<=n; i++) {
    term=0;
    for(j=1; j<=i; j++) {
        term = term +j;
    }
    s = s+term;  
}
printf("%d",s);
}