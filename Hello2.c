#include <stdio.h>
int main()
{
    int a,b,c,area;
    printf("Enter First Side:\n");
    scanf("%d",&a);
    printf("Enter Second Side:\n");
    scanf("%d",&b);
    printf("Enter Third Side:\n");
    scanf("%d",&c);
      area=a*b*c;
      printf("The area of the given rectangle is:",area);
      return 0;
}